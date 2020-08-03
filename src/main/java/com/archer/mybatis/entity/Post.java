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
@TableName("mto_post")
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long authorId;

    private Integer channelId;

    private Integer comments;

    private LocalDateTime created;

    private Integer favors;

    private Integer featured;

    private Integer status;

    private String summary;

    private String tags;

    private String thumbnail;

    private String title;

    private Integer views;

    private Integer weight;


}
