package com.shahir.taskit.backend.repository;

import com.shahir.taskit.backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUsername(String username);
}