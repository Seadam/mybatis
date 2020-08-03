package com.archer.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

/**
 * @Author: Archer
 * @Date: 2020/7/31
 * @Description:
 * @Version: 1.0
 */
@Data
public class User {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableLogic(value = "N", delval = "Y")
    private String isDelete;
}