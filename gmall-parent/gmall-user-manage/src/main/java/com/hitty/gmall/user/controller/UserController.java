package com.hitty.gmall.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hitty.gmall.bean.UserInfo;
import com.hitty.gmall.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }
}
