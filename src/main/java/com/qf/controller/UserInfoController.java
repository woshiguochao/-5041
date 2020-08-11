package com.qf.controller;

import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @SuppressWarnings("all")
    @Autowired
    private UserInfoService userInfoService;
    //根据用户ID获取用户信息
    @RequestMapping("getUserInfoByUserInfoid")
    public Object getUserInfoByUserInfoid(@RequestParam int userinfoid){
        UserInfo userInfoByUserInfoid = userInfoService.getUserInfoByUserInfoid(userinfoid);
        System.out.println(userInfoByUserInfoid);
        return userInfoByUserInfoid;
    }

    @RequestMapping("editUserInfo")
    public boolean editUserInfo(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        boolean b = userInfoService.editUserInfo(userInfo);
        System.out.println(b);
        return b;
    }
    //修改个人信息
    @RequestMapping("updateUserInfoByUserInfoId")
    public boolean updateUserInfoByUserInfoId(@RequestBody UserInfo userInfo){
        boolean b = userInfoService.updateUserInfoByUserInfoId(userInfo);
        System.out.println(b);
        return b;

    }
}
