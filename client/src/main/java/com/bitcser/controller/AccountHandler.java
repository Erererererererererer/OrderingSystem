package com.bitcser.controller;

import com.bitcser.entity.User;
import com.bitcser.feign.AccountFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    AccountFeign accountFeign;

    @GetMapping("/login/{username}/{password}/{type}")
    public boolean login(@PathVariable("username") String username, @PathVariable("password") String password,
                         @PathVariable("type") String type) {
        return accountFeign.login(username, password, type);
    }

    @PostMapping("/register")
    public void register(User user){
        accountFeign.register(user);
    }

}
