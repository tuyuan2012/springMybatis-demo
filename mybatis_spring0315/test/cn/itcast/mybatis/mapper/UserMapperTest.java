package cn.itcast.mybatis.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.mybatis.po.User;

public class UserMapperTest {

	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		// 获取spring的容器

		applicationContext = new ClassPathXmlApplicationContext(
				"spring/applicationContext.xml");

	}

	@Test
	public void testFindUserById() throws Exception {
		//从spring容器中获取mapper实例 
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		//调用mapper方法
		User user = userMapper.findUserById(1);
		System.out.println(user);

	}

}
