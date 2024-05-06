package com.shahir.taskit.backend.repository;

import com.shahir.taskit.backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Add custom query methods if needed
}