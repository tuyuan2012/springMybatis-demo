package cn.itcast.mybatis.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.mybatis.po.Items;
import cn.itcast.mybatis.po.ItemsExample;

public class ItemsMapperTest {

	private ApplicationContext applicationContext;
	
	private ItemsMapper itemsMapper;

	@Before
	public void setUp() throws Exception {
		//获取spring的容器
		
		applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");
	}

	@Test
	public void testDeleteByExample() {
		
	}

	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
//		itemsMapper.insert(record);
	}

	//自定义条件查询
	@Test
	public void testSelectByExample() {
		ItemsExample itemsExample = new ItemsExample();
		ItemsExample.Criteria criteria = itemsExample.createCriteria();
		//拼接商品id等于？？某
		criteria.andIdEqualTo(1);
		
		List<Items> list = itemsMapper.selectByExample(itemsExample);
		
		//查询时将大文本的列也查询出来
//		itemsMapper.selectByExampleWithBLOBs(example);
		
		System.out.println(list);
		
	}

	//根据主键查询
	@Test
	public void testSelectByPrimaryKey() {
		Items items = itemsMapper.selectByPrimaryKey(1);
		System.out.println(items);
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		//updateByPrimaryKey不管输入 的参数是否为空都更新，所以实际开中，先从数据库查询出来，再设置更新的值。
		//itemsMapper.updateByPrimaryKey(record);
		
		//输入的参数不为空再更新
//		itemsMapper.updateByPrimaryKeySelective(record)
	}

}
