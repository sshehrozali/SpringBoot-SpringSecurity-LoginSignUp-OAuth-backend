package com.main.signuploginapp.controller;

import com.main.signuploginapp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.main.signuploginapp.service.UserService;

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
}
