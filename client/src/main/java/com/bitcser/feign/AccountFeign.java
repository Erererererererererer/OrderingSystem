package com.bitcser.feign;

import com.bitcser.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "account")
public interface AccountFeign {

    @GetMapping("/account/login/{username}/{password}/{type}")
    public boolean login(@PathVariable("username") String username, @PathVariable("password") String password,
                         @PathVariable("type") String type);

    @PostMapping("/account/register")
    public void register(@RequestBody User user);

}
