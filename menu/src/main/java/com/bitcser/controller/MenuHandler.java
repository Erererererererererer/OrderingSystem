package com.bitcser.controller;

import com.bitcser.entity.Menu;
import com.bitcser.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private MenuRepository menuRepository;

    @RequestMapping("/index")
    public String index() {
        return this.port;
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu) {
        menuRepository.save(menu);
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") int id) {
        menuRepository.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Menu menu) {
        menuRepository.update(menu);
    }

    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        return menuRepository.findAll(index, limit);
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") int id) {
        return menuRepository.findById(id);
    }
}
