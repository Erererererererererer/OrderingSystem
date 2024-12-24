package com.bitcser.controller;

import com.bitcser.common.Result;
import com.bitcser.entity.User;
import com.bitcser.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserHandler {

    @Autowired
    private UserFeign userFeign;

    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable("id") int id) {
        userFeign.deleteById(id);
        return Result.success();
    }

    @DeleteMapping("/deleteByUsername/{username}")
    public Result deleteByUsername(@PathVariable("username") String username) {
        userFeign.deleteByUsername(username);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(User user) {
        userFeign.update(user);
        return Result.success();
    }

    @GetMapping("/findById/{id}")
    public Result findByUsername(@PathVariable("id") int id) {
        return Result.success(userFeign.findByUsername(id));
    }

    @GetMapping("/findByUsername/{username}")
    public Result findByUsername(@PathVariable("username") String username) {
        return Result.success(userFeign.findByUsername(username));
    }

}
