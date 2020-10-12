package com.ltd.aidou.domain;

import com.ltd.aidou.dao.UserDao;

import java.util.List;

public class User implements UserDao {
    private int userid;
    private String username;
    private String userpassword;

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }


    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                '}';
    }


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> userId(int id) {
        return null;
    }


    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }


    @Override
    public List<User> likeFind(String username) {
        return null;
    }

    @Override
    public List<User> findOne(int id) {
        return null;
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }
}