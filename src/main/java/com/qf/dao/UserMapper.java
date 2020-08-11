package com.qf.dao;

import com.qf.pojo.User;


public interface UserMapper {
    public User loginCheck(User user);

   public User loginCheck2(User user2);

    public int registerUserInfo(User user);

    public String checkUserName(String username);

    /**
     * 通过userid获取user
     * @param id
     * @return
     */
    public User getUserInfo(int id);
}
