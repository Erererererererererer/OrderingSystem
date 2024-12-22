package com.bitcser.feign;

import com.bitcser.entity.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);

    @GetMapping("/menu/findById/{id}")
    public Menu findById(@PathVariable("id") int id);

    @PostMapping("/menu/save")
    public void save(@RequestBody Menu menu);

    @PutMapping("/menu/update")
    public void update(@RequestBody Menu menu);

    @DeleteMapping("/menu/deleteById/{id}")
    public void delete(@PathVariable("id") int id);
}
