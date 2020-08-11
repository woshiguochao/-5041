package com.qf.service.impl;

import com.qf.dao.UserMapper;
import com.qf.pojo.User;
import com.qf.service.UserService;
import com.qf.toolkit.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 用户登入检测
     * @param user
     * @return
     */
    public User loginCheck(User user) {
        String pwd =  Md5.encodePassword(user.getUserpass());
        user.setUserpass(pwd);
        User user1 = userMapper.loginCheck(user);
        return user1;
    }
    /**
     * 自动登入检测
     * @param user2
     * @return
     */
    public User loginCheck2(User user2) {
        User user1 = userMapper.loginCheck(user2);
        return user1;
    }

    /**
     * 用户注册检测
     * @param username
     * @return
     */
    public String checkUserName(String username) {
        String userName = userMapper.checkUserName(username);
        return userName;
    }
    /**
     * 通过userid获取user
     * @param id
     * @return
     */
    public User getUserInfo(int id) {
        return userMapper.getUserInfo(id);
    }

    /**
     * 新用户注册
     * @param user
     * @return
     */
    public boolean registerUserInfo(User user) {
        String pwd =  Md5.encodePassword(user.getUserpass());
        user.setUserpass(pwd);
        user.setCreatetime(new Date());
        int register = userMapper.registerUserInfo(user);
        return register>0;
    }
}
