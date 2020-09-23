package com.zlm.controller;

import com.github.pagehelper.Page;
import com.zlm.entity.Car;
import com.zlm.entity.JsonResult;
import com.zlm.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Validated
@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("/showCar.do")
    @ResponseBody
    public Map<String, Object> showCar(int page, int limit) {
        List<Car> car = carService.findCar(page,limit);
        long total = ((Page) car).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",null);
        map.put("count",total);
        map.put("data",car);
        return map;
    }

    @RequestMapping("/findCarById.do")
    @ResponseBody
    public JsonResult findCarById(int id){
        Car car = carService.findCarById(id);
        return new JsonResult(1,car);
    }
}
