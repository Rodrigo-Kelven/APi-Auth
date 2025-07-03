package com.example.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.jwt.model.User;
import com.example.jwt.repository.UserRepository;

@Service
public class AuthService {

    private final PasswordEncoder passwordEncoder;
    
    private final UserRepository userRepository;

    // Constructor injection for both PasswordEncoder and UserRepository
    @Autowired
    public AuthService(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;  // Injected PasswordEncoder (BCryptPasswordEncoder)
        this.userRepository = userRepository;    // Injected UserRepository
    }

    public User registerUser(User user) {
        // Encode the password using the injected PasswordEncoder (which is BCryptPasswordEncoder)
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }
}
