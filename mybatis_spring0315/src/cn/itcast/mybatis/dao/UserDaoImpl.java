package cn.itcast.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.itcast.mybatis.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	

	@Override
	public User findUserById(int id) throws Exception {
		SqlSession sqlSession = null;
		User user = null;
		try {
			sqlSession = this.getSqlSession();
			
			// 通过sqlsession操作数据库
			// 第一个参数：statemnet的id，是namespace+"."+statemnet的id
			// 第二个参数：输入 参数
			user = sqlSession.selectOne("test.findUserById", 1);

			//System.out.println(user);

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return user;
	}

	

}
