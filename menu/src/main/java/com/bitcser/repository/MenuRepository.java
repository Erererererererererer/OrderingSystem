package com.bitcser.repository;

import com.bitcser.entity.Menu;

import java.util.List;

public interface MenuRepository {

    public List<Menu> findAll(int index,int limit);
    public Menu findById(long id);
    public int count();
    public void add(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);

}
