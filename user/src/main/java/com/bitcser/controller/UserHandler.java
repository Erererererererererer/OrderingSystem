package com.bitcser.controller;

import com.bitcser.entity.User;
import com.bitcser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/index")
    public String index() {
        return this.port;
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") int id) {
        userRepository.deleteById(id);
    }

    @DeleteMapping("/deleteByUsername/{username}")
    public void deleteByUsername(@PathVariable("username") String username) {
        userRepository.deleteByUsername(username);
    }

    @PutMapping("/update")
    public void update(User user) {
        userRepository.update(user);
    }

    @GetMapping("/findById/{id}")
    public User findByUsername(@PathVariable("id") int id) {
        return userRepository.findById(id);
    }

    @GetMapping("/findByUsername/{username}")
    public User findByUsername(@PathVariable("username") String username) {
        return userRepository.findByUsername(username);
    }

}
