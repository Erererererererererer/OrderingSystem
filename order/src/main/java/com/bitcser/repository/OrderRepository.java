package com.bitcser.repository;

import com.bitcser.entity.Order;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrderRepository {

    public void add(Order order);
    public void deleteByUid(long uid);
    public void deleteByMid(long mid);
    public void updateState(long id, long aid, long state);
    public List<Order> findAll();
    public Order findById(long id);
    public List<Order> findAllByUid(long uid);
    public List<Order> findAllByState(int state);

}
