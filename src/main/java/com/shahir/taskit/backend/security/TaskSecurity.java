package com.shahir.taskit.backend.security;

import com.shahir.taskit.backend.model.Task;
import com.shahir.taskit.backend.repository.TaskRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component("taskSecurity")
public class TaskSecurity {

    private final TaskRepository taskRepository;

    public TaskSecurity(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public boolean isTaskOwner(Authentication authentication, Long taskId) {
        String username = authentication.getName();
        Task task = taskRepository.findById(taskId).orElse(null);

        return task != null && task.getUsername().equals(username);
    }
}