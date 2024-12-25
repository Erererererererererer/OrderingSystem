package com.bitcser.controller;

import com.bitcser.common.Result;
import com.bitcser.entity.Course;
import com.bitcser.entity.Order;
import com.bitcser.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderHandler {

    @Autowired
    private OrderFeign orderFeign;

    @PostMapping("/add")
    public Result add(@RequestBody Order order) {
        orderFeign.add(order);
        return Result.success();
    }

    @DeleteMapping("/deleteByUid/{uid}")
    public Result deleteByUid(@PathVariable("uid") int uid) {
        orderFeign.deleteByUid(uid);
        return Result.success();
    }

    @PutMapping("/updateState/{id}/{aid}")
    public Result updateState(@PathVariable("id") int id, @PathVariable("aid") int aid) {
        orderFeign.updateState(id, aid);
        return Result.success();
    }

    @GetMapping("/findAll")
    public Result findAll() {
        return Result.success(orderFeign.findAll());
    }

    @GetMapping("/findById/{id}")
    public Result findById(@PathVariable("id") int id) {
        return Result.success(orderFeign.findById(id));
    }

    @GetMapping("/findAllByUid/{uid}")
    public Result findAllByUid(@PathVariable("uid") int uid) {
        return Result.success(orderFeign.findAllByUid(uid));
    }

    @GetMapping("/findAllByState/{state}")
    public Result findAllByState(@PathVariable("state") int state) {
        return Result.success(orderFeign.findAllByState(state));
    }

    @GetMapping("/findAllCoursesByOid/{oid}")
    public Result findAllCoursesByOid(@PathVariable("oid") int oid) {
        return Result.success(orderFeign.findAllCoursesByOid(oid));
    }

}
