package com.zlm.controller;

import com.github.pagehelper.Page;
import com.zlm.entity.JsonResult;
import com.zlm.entity.Order;
import com.zlm.entity.User;
import com.zlm.service.OrderService;
import com.zlm.vo.OrderSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Validated
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/addOrder.do")
    @ResponseBody
    public JsonResult ordersubmit(HttpSession session,String id,String oprice){
        User user = (User) session.getAttribute("user");
        int uid = user.getId();
        Map map = (Map) session.getAttribute("map");
        String quiz2 = (String) map.get("quiz2");
        String quiz4 = (String) map.get("quiz4");
        Order order = new Order();
        order.setCid(Integer.parseInt(id));
        order.setUid(uid);
        order.setGetid(quiz2);
        order.setBackid(quiz4);
        order.setOprice(Double.parseDouble(oprice));
        order.setStatus("已预订");
        orderService.addOrder(order);
        return new JsonResult(1,"提交成功!");
    }

    @RequestMapping("/orderSelect.do")
    @ResponseBody
    public Map<String,Object> orderSelect(HttpSession session,int page,int limit){
        User user = (User) session.getAttribute("user");
        int uid = user.getId();
       List<OrderSelect> list =  orderService.findAll(uid,page,limit);
        long total = ((Page) list).getTotal();
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg",null);
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    @RequestMapping("/delOrder.do")
    @ResponseBody
    public JsonResult delOrder(String id){
        orderService.deleteOrd(id);
        return new JsonResult(1,"删除成功!");
    }

}
