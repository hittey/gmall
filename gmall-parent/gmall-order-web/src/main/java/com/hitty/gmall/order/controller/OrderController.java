package com.hitty.gmall.order.controller;

import java.util.List;
import com.hitty.gmall.bean.*;
import com.hitty.gmall.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    @Autowired
    private UserService userService;


    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> trade(String userId){
        return userService.getUserAddressList(userId);
    }
    
}
