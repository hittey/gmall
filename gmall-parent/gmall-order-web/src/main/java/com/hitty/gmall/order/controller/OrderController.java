package com.hitty.gmall.order.controller;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hitty.gmall.bean.*;
import com.hitty.gmall.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    @Reference
    private UserService userService;


    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> trade(String userId){
        return userService.getUserAddressList(userId);
    }
    
}
