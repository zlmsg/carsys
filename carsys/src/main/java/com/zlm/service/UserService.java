package com.zlm.service;

import com.zlm.entity.User;

public interface UserService {
    User findByTel(String tel, String password);

    void insertUser(User user);
}
