package com.bitcser.controller;

import com.bitcser.common.Result;
import com.bitcser.entity.User;
import com.bitcser.feign.AccountFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
@CrossOrigin
public class AccountHandler {

    @Autowired
    AccountFeign accountFeign;

    @PostMapping("/register")
    public Result register(User user){
        accountFeign.register(user);
        return Result.success();
    }

    @GetMapping("/login/{username}/{password}/{type}")
    public Result login(@PathVariable("username") String username, @PathVariable("password") String password,
                        @PathVariable("type") String type) {
        return Result.success(accountFeign.login(username, password, type));
    }

}
