package com.bitcser.repository;

import com.bitcser.entity.User;

public interface UserRepository {
    public User findByUsername(String username);
    public User findById(long id);
    public void deleteById(long id);
    public void deleteByUsername(String username);
    public void update(User user);
}
