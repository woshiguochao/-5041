package com.qf.service;
import com.qf.pojo.User;

public interface UserService {
    public User loginCheck(User user);
    //自动登入查询
   public User loginCheck2(User user2);

    public boolean registerUserInfo(User user);

    public String checkUserName(String username);
    /**
     * 通过userid获取user
     * @param id
     * @return
     */
    public User getUserInfo(int id);
}
