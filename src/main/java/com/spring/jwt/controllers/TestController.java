package com.spring.jwt.controllers;

import com.spring.jwt.entity.User;
import com.spring.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/test")
    public User test(@RequestParam String name){
        Optional<User> op=userRepository.findByUsername(name);
        return op.get();
    }
}
