package cn.itcast.mybatis.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.mybatis.po.User;

public class UserDaoImplTest {
	
	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		//获取spring的容器
		
		applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		
	}

	@Test
	public void testFindUserById() throws Exception {
			//从 spring容器中获取dao
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		
		//调用dao方法
		User user = userDao.findUserById(1);
		System.out.println(user);
		
	}

}
