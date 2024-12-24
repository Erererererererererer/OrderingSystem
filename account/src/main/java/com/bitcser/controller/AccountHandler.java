package com.bitcser.controller;

import com.bitcser.entity.Admin;
import com.bitcser.entity.User;
import com.bitcser.repository.AdminRepository;
import com.bitcser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/account")
@CrossOrigin
public class AccountHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/index")
    public String index() {
        return this.port;
    }

    @PostMapping("/register")
    public void register(@RequestBody User user){
        user.setRegisterdate(new Date());
        userRepository.add(user);
    }

    @GetMapping("/login/{username}/{password}/{type}")
    public boolean login(@PathVariable("username") String username, @PathVariable("password") String password,
                         @PathVariable("type") String type) {
        if (type.equals("admin")) {
            Admin admin = adminRepository.findWithPassword(username, password);
            return admin != null;
        } else if (type.equals("user")) {
            User user = userRepository.findWithPassword(username, password);
            return user != null;
        }
        return false;
    }

}
