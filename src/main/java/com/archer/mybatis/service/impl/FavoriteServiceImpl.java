package com.archer.mybatis.service.impl;

import com.archer.mybatis.entity.Favorite;
import com.archer.mybatis.mapper.FavoriteMapper;
import com.archer.mybatis.service.IFavoriteService;
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
public class FavoriteServiceImpl extends ServiceImpl<FavoriteMapper, Favorite> implements IFavoriteService {

}
