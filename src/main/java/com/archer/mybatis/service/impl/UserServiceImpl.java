package com.archer.mybatis.service.impl;

import com.archer.mybatis.entity.User;
import com.archer.mybatis.mapper.UserMapper;
import com.archer.mybatis.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
