package com.ltd.aidou.dao.impl;

import com.ltd.aidou.dao.UserDao;
import com.ltd.aidou.domain.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
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
