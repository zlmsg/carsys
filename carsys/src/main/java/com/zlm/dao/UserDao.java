package com.zlm.dao;

import com.zlm.entity.User;

public interface UserDao {
    User findByTel(String tel);

    void insertUser(User user);
}
