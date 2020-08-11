package com.qf.service;

import com.qf.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {
    //根据用户ID获取用户信息
    public UserInfo getUserInfoByUserInfoid(int userinfoid);

    public boolean editUserInfo(UserInfo userInfo);
    //修改个人信息
    public boolean updateUserInfoByUserInfoId(UserInfo userInfo);
}
