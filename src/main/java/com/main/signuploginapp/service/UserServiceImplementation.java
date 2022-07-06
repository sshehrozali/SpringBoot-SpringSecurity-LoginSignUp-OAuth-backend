package com.main.signuploginapp.service;

import com.main.signuploginapp.entity.User;
import com.main.signuploginapp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.main.signuploginapp.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String createUser(UserModel newUserData) {
        User newUser = new User();  // Created new User entity

        // Get incoming model data and sets it to entity
        newUser.setEmail(newUserData.getIncoming_email());
        newUser.setName(newUserData.getIncoming_name());
        newUser.setPassword(passwordEncoder.encode(newUserData.getIncoming_password()));
        newUser.setAccess(false);   // Disables User already

        userRepository.save(newUser);   // Save to database
        return "User Saved!";
    }
}
