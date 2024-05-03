package com.shahir.taskit.backend.repository;


import com.shahir.taskit.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom query methods if needed
}
