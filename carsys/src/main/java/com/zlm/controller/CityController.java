package com.zlm.controller;

import com.zlm.entity.City;
import com.zlm.entity.JsonResult;
import com.zlm.entity.User;
import com.zlm.service.CityService;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Validated
@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/select.do")
    @ResponseBody
    public JsonResult select(int pid){

        List<City> citys = cityService.selectByPid(pid);

        return new JsonResult(1,citys);
    }

    @RequestMapping("/button.do")
    @ResponseBody
    public JsonResult button(@NotEmpty String quiz1, @NotEmpty String quiz2, @NotEmpty  String quiz3, @NotEmpty  String quiz4, HttpSession session){

        HashMap<String, String> map = new HashMap<>();
        map.put("quiz1",quiz1);
        map.put("quiz2",quiz2);
        map.put("quiz3",quiz3);
        map.put("quiz4",quiz4);
        session.setAttribute("map",map);
        return new JsonResult(1,null);
    }

    @RequestMapping("/selectName.do")
    @ResponseBody
    public JsonResult selectName(HttpSession session){

        Map map = (Map) session.getAttribute("map");
        List<String> list = cityService.selectById(map);
        return new JsonResult(1, list);
    }
}
