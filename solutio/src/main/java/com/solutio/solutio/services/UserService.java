package com.solutio.solutio.services;

import com.solutio.solutio.entities.User;
import com.solutio.solutio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User savedUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public boolean validateUserCredentials(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        return user.map(u -> u.getPassword().equals(password)).orElse(false);
    }
}
