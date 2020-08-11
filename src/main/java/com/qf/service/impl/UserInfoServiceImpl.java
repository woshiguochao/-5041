package com.qf.service.impl;

import com.qf.dao.UserInfoMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    //根据用户ID获取用户信息
    public UserInfo getUserInfoByUserInfoid(int userinfoid) {
        return userInfoMapper.getUserInfoByUserInfoid(userinfoid);
    }

    public boolean editUserInfo(UserInfo userInfo) {
        int i = userInfoMapper.editUserInfo(userInfo);
        return i >0;
    }
    //修改个人信息
    public boolean updateUserInfoByUserInfoId(UserInfo userInfo) {
        int i = userInfoMapper.updateUserInfoByUserInfoId(userInfo);
        return i>0;
    }
}
