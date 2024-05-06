package com.shahir.taskit.backend.repository;


import com.shahir.taskit.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom query methods if needed

    Optional<User> findByUsername(String username);
}
