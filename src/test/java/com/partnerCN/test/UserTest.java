package com.partnerCN.test;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.partnerCN.dao.UserMapper;
import com.partnerCN.model.User;
import com.partnerCN.util.GetMethod;
import com.partnerCN.util.SqlSessionfactoryUtil;

/**
 * @Author:YKK_LiaoJJ
 * @Time:2018年8月30日
 * @content:
 */
public class UserTest {

	private SqlSession sqlSession = null;
    private static Logger logger = Logger.getLogger(String.valueOf(UserTest.class));
    private static String currentDate = new GetMethod().getCurrentDate();
	private UserMapper userMapper = null;
    
    @Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionfactoryUtil.openSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	@Test
	public void testAdd() {
		logger.info("添加学生");
		User user = new User("Joy", "123", "小春", "女", 22, "1364321597", "1364321597@qq.com", currentDate);
        userMapper.add(user);
        sqlSession.commit();
	}

}
