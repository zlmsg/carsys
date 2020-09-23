package com.zlm.service.impl;

import com.zlm.dao.UserDao;
import com.zlm.entity.User;
import com.zlm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findByTel(String tel, String password) {

        User user = userDao.findByTel(tel);

        if(user==null){
            throw new RuntimeException("账户不存在！");
        }

        if(!password.equals(user.getPassword())){
            throw new RuntimeException("密码错误！");
        }

        return user;
    }

    @Override
    public void insertUser(User user) {
        User user1 = userDao.findByTel(user.getTel());
        if(user1!=null){
            throw new RuntimeException("用户已存在！");
        }
        userDao.insertUser(user);
    }
}
