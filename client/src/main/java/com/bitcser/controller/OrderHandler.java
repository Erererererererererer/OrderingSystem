package com.bitcser.controller;

import com.bitcser.entity.Order;
import com.bitcser.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderHandler {

    @Autowired
    private OrderFeign orderFeign;

    @PostMapping("/add")
    public void add(Order order) {
        orderFeign.add(order);
    }

    @DeleteMapping("/deleteByUid/{uid}")
    public void deleteByUid(@PathVariable("uid") int uid) {
        orderFeign.deleteByUid(uid);
    }

    @DeleteMapping("/deleteByMid/{mid}")
    public void deleteByMid(@PathVariable("mid") int mid) {
        orderFeign.deleteByMid(mid);
    }

    @PutMapping("/updateState/{id}/{aid}")
    public void updateState(@PathVariable("id") int id, @PathVariable("aid") int aid) {
        orderFeign.updateState(id, aid);
    }

    @GetMapping("/findById/{id}")
    public Order findById(@PathVariable("id") int id) {
        return orderFeign.findById(id);
    }

    @GetMapping("/findAllByUid/{uid}")
    public List<Order> findAllByUid(@PathVariable("uid") int uid) {
        return orderFeign.findAllByUid(uid);
    }

    @GetMapping("/findAllByState/{state}")
    public List<Order> findAllByState(@PathVariable("state") int state) {
        return orderFeign.findAllByState(state);
    }

}
