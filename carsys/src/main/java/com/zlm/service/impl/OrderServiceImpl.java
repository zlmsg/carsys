package com.zlm.service.impl;

import com.github.pagehelper.PageHelper;
import com.zlm.dao.OrderDao;
import com.zlm.entity.Order;
import com.zlm.service.OrderService;
import com.zlm.vo.OrderSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public Order findById(int id) {
        Order order = orderDao.findById(id);
        return null;
    }

    @Override
    public void addOrder(Order order) {
        orderDao.addOrder(order);
    }

    @Override
    public List<OrderSelect> findAll(int uid, int page, int limit) {
        PageHelper.startPage(page,limit);
        List<OrderSelect> list = orderDao.findAll(uid);
        return list;
    }

    @Override
    public void deleteOrd(String id) {
        orderDao.deleteOrd(id);
    }
}
