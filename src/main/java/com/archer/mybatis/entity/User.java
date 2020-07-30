package com.archer.mybatis.entity;

import lombok.Data;

/**
 * @Author: Archer
 * @Date: 2020/7/31
 * @Description:
 * @Version: 1.0
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}