package com.archer.mybatis.service.impl;

import com.archer.mybatis.entity.Tag;
import com.archer.mybatis.mapper.TagMapper;
import com.archer.mybatis.service.ITagService;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
