package com.bitcser.controller;

import com.bitcser.entity.User;
import com.bitcser.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserFeign userFeign;

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") int id) {
        userFeign.deleteById(id);
    }

    @DeleteMapping("/deleteByUsername/{username}")
    public void deleteByUsername(@PathVariable("username") String username) {
        userFeign.deleteByUsername(username);
    }

    @PutMapping("/update")
    public void update(User user) {
        userFeign.update(user);
    }

    @GetMapping("/findById/{id}")
    public User findByUsername(@PathVariable("id") int id) {
        return userFeign.findByUsername(id);
    }

    @GetMapping("/findByUsername/{username}")
    public User findByUsername(@PathVariable("username") String username) {
        return userFeign.findByUsername(username);
    }

}
