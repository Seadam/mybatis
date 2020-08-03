package com.archer.mybatis.mto.service.impl;

import com.archer.mybatis.mto.entity.Resource;
import com.archer.mybatis.mto.mapper.ResourceMapper;
import com.archer.mybatis.mto.service.IResourceService;
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
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {

}
