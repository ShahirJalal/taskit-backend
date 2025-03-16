package com.shahir.taskit.backend.security;

import com.shahir.taskit.backend.model.User;
import com.shahir.taskit.backend.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component("userSecurity")
public class UserSecurity {

    private final UserRepository userRepository;

    public UserSecurity(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isUserSelf(Authentication authentication, Long userId) {
        String username = authentication.getName();
        User user = userRepository.findByUsername(username).orElse(null);

        return user != null && user.getId().equals(userId);
    }
}