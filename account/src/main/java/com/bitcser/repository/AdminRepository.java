package com.bitcser.repository;

import com.bitcser.entity.Admin;

public interface AdminRepository {
    public Admin findWithPassword(String username, String password);
}
