package com.zlm.service;

import com.zlm.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> findCar(int page, int limit);

    Car findCarById(int id);
}
