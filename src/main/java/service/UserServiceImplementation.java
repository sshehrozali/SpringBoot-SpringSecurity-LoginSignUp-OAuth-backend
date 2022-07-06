package service;

import entity.User;
import model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repository.UserRepository;

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

        userRepository.save(newUser);   // Save to database
        return "User Saved!";
    }
}
