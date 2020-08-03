package com.archer.mybatis.entity;

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
public class Shadow implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户
     */
    private String account;

    /**
     * 密码
     */
    private String passwd;

    /**
     * 数据库或其他
     */
    private String database;

    /**
     * 修改时间
     */
    private LocalDateTime etime;

    /**
     * 备注
     */
    private String memo;


}
