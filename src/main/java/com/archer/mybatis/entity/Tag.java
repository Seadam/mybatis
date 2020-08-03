package com.archer.mybatis.entity;

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
@TableName("mto_tag")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDateTime created;

    private String description;

    private Long latestPostId;

    private String name;

    private Integer posts;

    private String thumbnail;

    private LocalDateTime updated;


}
