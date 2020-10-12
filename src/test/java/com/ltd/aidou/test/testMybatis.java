package com.ltd.aidou.test;

import com.ltd.aidou.dao.UserDao;
import com.ltd.aidou.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class testMybatis {
    private InputStream in;
    private SqlSession sqlSession;
    private UserDao userDao;

    @Before
    public void init() throws Exception {
        // 读取配置文件
        in = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession(true);
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @After
    public void destory() throws Exception {
        sqlSession.close();
        in.close();
    }

    // 查询所有用户信息
    @Test
    public void testFindall() {
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    // 根据 id 查询用户信息
    @Test
    public void testuserId() {
        List<User> users = userDao.userId(1004);
        System.out.println(users);
    }

    // 删除 id 为 12421 的用户信息
    @Test
    public void deleteUsertest() {
        int row = userDao.deleteUser(12421);
        if (row > 0) {
            System.out.println("用户删除成功: " + row);
        } else {
            System.out.println("用户删除失败: " + row);
            sqlSession.rollback();
        }
    }

    // 根据用户 id为 1001,修改用户的用户名和密码为 user1101
    @Test
    public void updateUsertest() {
        User user = new User();
        user.setUserid(1001);
        user.setUsername("user1203");
        user.setUserpassword("user1203");
        // 用户信息保存
        int row = userDao.updateUser(user);
        if (row > 0) {
            System.out.println("用户信息修改成功: " + user);
        } else {
            System.out.println("用户信息修改失败：" + user);
            sqlSession.rollback();
        }

    }

    @Test
    public void likeFindtest() {
        List<User> users = userDao.likeFind("%user100%");
        for (User user : users) {
            System.out.println(user);
        }
    }

    // 通过注解获取用户信息
    @Test
    public void findone() {
        List<User> users = userDao.findOne(1001);
        System.out.println(users);
    }

    // 实现用户信息注册功能
    @Test
    public void insertUsers() {
        User users = new User();
        users.setUserid(19991);
        users.setUsername("user1991");
        users.setUserpassword("user1991");
        int rows = userDao.insertUser(users);
        if (rows > 0) {
            System.out.println("用户信息注册成功: " + users);
        } else {
            System.out.println("用户信息注册失败: " + users);
            sqlSession.rollback();
        }

    }
}
