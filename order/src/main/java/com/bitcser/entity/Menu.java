package com.bitcser.entity;

import lombok.Data;

@Data
public class Menu {
    private int id;
    private String name;
    private double price;
    private String flavor;  // 口味
    private int tid;
    private Type type;  // 外键连type表
}
