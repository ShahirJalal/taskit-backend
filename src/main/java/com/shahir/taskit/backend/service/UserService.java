package com.shahir.taskit.backend.service;


import com.shahir.taskit.backend.model.User;
import com.shahir.taskit.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create operation
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Read operation
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Update operation
    public User updateUser(Long id, User newUser) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();
            existingUser.setUsername(newUser.getUsername());
            existingUser.setPassword(newUser.getPassword());
            existingUser.setEmail(newUser.getEmail());
            return userRepository.save(existingUser);
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }

    // Delete operation
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}