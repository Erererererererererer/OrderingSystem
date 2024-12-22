package com.bitcser.repository;

import com.bitcser.entity.User;

public interface UserRepository {

    public void add(User user);
    public User findWithPassword(String username, String password);

}
