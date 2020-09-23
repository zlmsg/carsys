package com.zlm.service;

import com.zlm.entity.City;

import java.util.List;
import java.util.Map;

public interface CityService {
    List<City> selectByPid(int i);

    List<String> selectById(Map map);
}
