package com.bitcser.feign;

import com.bitcser.common.Result;
import com.bitcser.entity.Course;
import com.bitcser.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "order")
public interface OrderFeign {

    @PostMapping("/order/add")
    public void add(@RequestBody Order order);

    @DeleteMapping("/order/deleteByUid/{uid}")
    public void deleteByUid(@PathVariable("uid") int uid);

    @PutMapping("/order/updateState/{id}/{aid}")
    public void updateState(@PathVariable("id") int id, @PathVariable("aid") int aid);

    @GetMapping("/order/findAll")
    public List<Order> findAll();

    @GetMapping("/order/findById/{id}")
    public Order findById(@PathVariable("id") int id);

    @GetMapping("/order/findAllByUid/{uid}")
    public List<Order> findAllByUid(@PathVariable("uid") int uid);

    @GetMapping("/order/findAllByState/{state}")
    public List<Order> findAllByState(@PathVariable("state") int state);

    @GetMapping("/order/findAllCoursesByOid/{oid}")
    public List<Course> findAllCoursesByOid(@PathVariable("oid") int oid);

}
