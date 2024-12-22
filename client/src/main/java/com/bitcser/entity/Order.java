package com.bitcser.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {

    private int id;
    private int uid;
    private int mid;
    private int aid;
    private Date date;
    private int state;
    private User user;  // 外键连user表
    private Menu menu;  // 外键连menu表
    private Admin admin;  // 外键连admin表

}
