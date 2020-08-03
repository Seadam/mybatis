package com.archer.mybatis.service.impl;

import com.archer.mybatis.entity.Post;
import com.archer.mybatis.mapper.PostMapper;
import com.archer.mybatis.service.IPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Archer
 * @since 2020-08-02
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {

}
