package com.hitty.gmall.user.service.impl;

import com.hitty.gmall.service.UserService;
import com.hitty.gmall.user.mapper.UserAddressMapper;
import com.hitty.gmall.user.mapper.UserInfoMapper;
import java.util.List;

import com.hitty.gmall.bean.UserAddress;
import com.hitty.gmall.bean.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> findAll(){
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // TODO Auto-generated method stub
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return userAddressMapper.select(userAddress);
    }
}
