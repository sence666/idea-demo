package com.hxzy.controller;

import com.hxzy.pojo.User;
import com.hxzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("user/{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long userId){

        User user=  userService.queryUserById(userId);
        if(user!=null){

            return  user;
        }
        return  null;
    }


    @GetMapping("/all")
    public String all(Model model){

        List<User> users=userService.findAll();

        model.addAttribute("users","users");
        return "hehe";
    }
}
