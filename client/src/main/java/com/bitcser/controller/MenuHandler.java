package com.bitcser.controller;

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

    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        return menuFeign.findAll(index, limit);
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") int id) {
        return menuFeign.findById(id);
    }

    @PostMapping("/add")
    public void add(Menu menu) {
        menuFeign.add(menu);
    }

    @PutMapping("/update")
    public void update(Menu menu) {
        menuFeign.update(menu);
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") int id) {
        menuFeign.delete(id);
    }

}
