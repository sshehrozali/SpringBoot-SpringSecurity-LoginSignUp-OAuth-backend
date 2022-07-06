package com.main.signuploginapp.controller;

import com.main.signuploginapp.entity.User;
import com.main.signuploginapp.model.ResetPasswordModel;
import com.main.signuploginapp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.main.signuploginapp.service.UserService;

import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {
        return "Running";
    }

    @PostMapping("/register")
    public String register(@RequestBody UserModel newUserData) {
        String res = userService.createUser(newUserData);
        return res;
    }

    @PostMapping("/resetpassword")
    public String resetPassword(@RequestBody ResetPasswordModel resetPasswordModel) {
        User user = userService.findUserByEmail(resetPasswordModel.getEmail());
        if (user != null) {
            String Token = UUID.randomUUID().toString();   // Generate Token for Password Reset
            userService.createResetPasswordToken(user, Token);
        }
    }
}
