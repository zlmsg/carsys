package com.zlm.controller;

import com.zlm.entity.JsonResult;
import com.zlm.entity.User;
import com.zlm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    @ResponseBody
    public JsonResult login(String tel, String password, HttpSession session){
        User user = userService.findByTel(tel,password);
        session.setAttribute("user",user);
        return new JsonResult(1,"登陆成功");
    }

    @RequestMapping("/register.do")
    @ResponseBody
    public JsonResult register(User user){
        userService.insertUser(user);
        return new JsonResult(1,"注册成功");
    }
    @RequestMapping("/query.do")
    @ResponseBody
    public JsonResult query(HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user!=null){
            return new JsonResult(1,user);
        }
        return new JsonResult(0,null);
    }


    @RequestMapping("/exit")
    public String exit(HttpSession session){
        session.removeAttribute("user");
        return "/login.html";
    }
}
