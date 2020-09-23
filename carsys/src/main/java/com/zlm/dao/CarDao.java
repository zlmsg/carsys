package com.zlm.dao;

import com.zlm.entity.Car;

import java.util.List;

public interface CarDao {

    List<Car> findCar();

    Car findCarById(int id);
}
