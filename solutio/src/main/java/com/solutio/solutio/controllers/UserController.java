package com.solutio.solutio.controllers;

import com.solutio.solutio.entities.User;
import com.solutio.solutio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userService.savedUser(user);
        return ResponseEntity.ok(savedUser);
    }
}
