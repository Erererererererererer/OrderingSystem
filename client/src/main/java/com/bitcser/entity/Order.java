package com.bitcser.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
public class Order {

    private int id;
    private int uid;
    private int aid;
    private Timestamp date;
    private int state;
    private User user;  // 外键连user表
    private Admin admin;  // 外键连admin表
    private List<Course> courses;  // 联查course表

}
