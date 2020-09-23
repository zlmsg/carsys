package com.zlm.dao;

import com.zlm.entity.Order;
import com.zlm.vo.OrderSelect;

import java.util.List;

public interface OrderDao {

    Order findById(int id);

    void addOrder(Order order);

    List<OrderSelect> findAll(int uid);

    void deleteOrd(String id);
}
