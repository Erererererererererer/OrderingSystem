package com.bitcser.repository;

import com.bitcser.entity.User;

import java.util.List;

public interface UserRepository {

    public void deleteById(long id);
    public void deleteByUsername(String username);
    public void update(User user);
    public List<User> findAll();
    public User findByUsername(String username);
    public User findById(long id);

}
