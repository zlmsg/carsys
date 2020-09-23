package com.zlm.service.impl;

import com.github.pagehelper.PageHelper;
import com.zlm.dao.CarDao;
import com.zlm.entity.Car;
import com.zlm.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> findCar(int page, int limit) {
        PageHelper.startPage(page, limit);
        List<Car> cars =  carDao.findCar();
        return cars;
    }

    @Override
    public Car findCarById(int id) {
        Car car = carDao.findCarById(id);
        return car;
    }

}
