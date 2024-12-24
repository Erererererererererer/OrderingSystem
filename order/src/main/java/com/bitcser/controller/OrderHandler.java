package com.bitcser.controller;

import com.bitcser.entity.Order;
import com.bitcser.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/index")
    public String index() {
        return "order的端口为：" + this.port;
    }

    @PostMapping("/add")
    public void add(@RequestBody Order order) {
        order.setDate(new Date());
        order.setState(0);
        orderRepository.add(order);
    }

    @DeleteMapping("/deleteByUid/{uid}")
    public void deleteByUid(@PathVariable("uid") int uid) {
        orderRepository.deleteByUid(uid);
    }

    @DeleteMapping("/deleteByMid/{mid}")
    public void deleteByMid(@PathVariable("mid") int mid) {
        orderRepository.deleteByMid(mid);
    }

    @PutMapping("/updateState/{id}/{aid}")
    public void updateState(@PathVariable("id") int id, @PathVariable("aid") int aid) {
        orderRepository.updateState(id, aid, 1);
    }

    @GetMapping("/findAll")
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Order findById(@PathVariable("id") int id) {
        return orderRepository.findById(id);
    }

    @GetMapping("/findAllByUid/{uid}")
    public List<Order> findAllByUid(@PathVariable("uid") int uid) {
        return orderRepository.findAllByUid(uid);
    }

    @GetMapping("/findAllByState/{state}")
    public List<Order> findAllByState(@PathVariable("state") int state) {
        return orderRepository.findAllByState(state);
    }

}
