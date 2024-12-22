package com.bitcser.repository;

import com.bitcser.entity.User;

public interface UserRepository {
    public User findWithPassword(String username, String password);
    public void add(User user);
}
