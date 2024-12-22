package com.bitcser.repository;

import com.bitcser.entity.User;

public interface UserRepository {

    public User findById(long id);

}
