package com.zlm.service.impl;

import com.zlm.dao.CityDao;
import com.zlm.entity.City;
import com.zlm.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> selectByPid(int i) {
        List<City> cities = cityDao.selectByPid(i);
        return cities;
    }

    @Override
    public List<String> selectById(Map map) {

        List<String> strings = new ArrayList<>();
        for (Object o : map.keySet()) {
            String name = cityDao.selectById((String)map.get(o));
            strings.add(name);
        }
        return strings;
    }
}
