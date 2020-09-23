package com.zlm.service;

import com.zlm.entity.Order;
import com.zlm.vo.OrderSelect;

import java.util.List;

public interface OrderService {
    Order findById(int id);

    void addOrder(Order order);

    List<OrderSelect> findAll(int uid, int page, int limit);

    void deleteOrd(String id);
}
