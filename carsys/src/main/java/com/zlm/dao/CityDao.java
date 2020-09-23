package com.zlm.dao;

import com.zlm.entity.City;

import java.util.List;

public interface CityDao {
    List<City> selectByPid(int i);

    String selectById(String id);
}
