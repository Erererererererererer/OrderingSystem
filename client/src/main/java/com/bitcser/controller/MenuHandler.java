package com.bitcser.controller;

import com.bitcser.common.Result;
import com.bitcser.entity.Menu;
import com.bitcser.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuFeign menuFeign;

    @PostMapping("/add")
    public Result add(Menu menu) {
        menuFeign.add(menu);
        return Result.success();
    }

    @DeleteMapping("/deleteById/{id}")
    public Result delete(@PathVariable("id") int id) {
        menuFeign.delete(id);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(Menu menu) {
        menuFeign.update(menu);
        return Result.success();
    }


    @GetMapping("/findAll/{index}/{limit}")
    public Result findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        return Result.success(menuFeign.findAll(index, limit));
    }

    @GetMapping("/findById/{id}")
    public Result findById(@PathVariable("id") int id) {
        return Result.success(menuFeign.findById(id));
    }

}
