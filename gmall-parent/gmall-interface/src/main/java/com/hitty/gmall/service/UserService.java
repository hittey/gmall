package com.hitty.gmall.service;

import java.util.List;

import com.hitty.gmall.bean.UserAddress;
import com.hitty.gmall.bean.UserInfo;

public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<UserInfo> findAll();

    List<UserAddress> getUserAddressList(String userId);
}
