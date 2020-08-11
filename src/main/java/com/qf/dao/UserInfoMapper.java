package com.qf.dao;

import com.qf.pojo.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    //根据用户ID获取用户信息
    public UserInfo getUserInfoByUserInfoid(int userinfoid);
    //
    public int editUserInfo(UserInfo userInfo);
    //修改个人信息
    public int updateUserInfoByUserInfoId(UserInfo userInfo);
}
