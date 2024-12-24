package com.bitcser.feign;

import com.bitcser.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "user")
public interface UserFeign {

    @DeleteMapping("/user/deleteById/{id}")
    public void deleteById(@PathVariable("id") int id);

    @DeleteMapping("/user/deleteByUsername/{username}")
    public void deleteByUsername(@PathVariable("username") String username);

    @PutMapping("/user/update")
    public void update(@RequestBody User user);

    @GetMapping("/user/findAll")
    public List<User> findAll();

    @GetMapping("/user/findById/{id}")
    public User findByUsername(@PathVariable("id") int id);

    @GetMapping("/user/findByUsername/{username}")
    public User findByUsername(@PathVariable("username") String username);

}
