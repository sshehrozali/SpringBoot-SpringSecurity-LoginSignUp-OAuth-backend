package com.main.signuploginapp.service;

import com.main.signuploginapp.entity.User;
import com.main.signuploginapp.model.UserModel;

public interface UserService {
    String createUser(UserModel newUserData);

    User findUserByEmail(String email);

    void createResetPasswordToken(User user, String token);
}
