package com.itlsc.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer gender;
    private String image;
    private String healthyGoal;
    private String tastes;    // 数据库存字符串，业务逻辑再处理
    private String allergies;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}