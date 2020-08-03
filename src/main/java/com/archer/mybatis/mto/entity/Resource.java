package com.archer.mybatis.mto.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Archer
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("mto_resource")
public class Resource implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long amount;

    private LocalDateTime createTime;

    private String md5;

    private String path;

    private LocalDateTime updateTime;


}
