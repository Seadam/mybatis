package com.archer.mybatis;

import com.archer.mybatis.entity.Tag;
import com.archer.mybatis.mapper.TagMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@MapperScan("com.archer.mybatis.*")
@ComponentScan("com.archer.mybatis.handler.*")
class MybatisApplicationTests {

	@Resource
	private TagMapper mapper;

	@Test
	void contextLoads() {
		System.out.println(("----- selectAll method test ------"));
		Tag tag = mapper.selectById(10);
		tag.setName("NIO");
		tag.setUpdated(null);
		mapper.updateById(tag);
		List<Tag> tagList = mapper.selectList(null);
		//Assert.assertEquals(5, userList.size());

		tagList.forEach(System.out::println);
	}

}
