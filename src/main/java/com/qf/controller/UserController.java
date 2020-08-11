package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import io.netty.handler.codec.http.HttpResponse;
import lombok.experimental.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.Servlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired
    UserService userService;

   // HttpServletResponse response = null;
    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
    /**
     * 用户登入检测
     * @param user
     * @return
     */
    public Object loginCheck(@RequestBody User user, HttpSession session,HttpServletResponse response) {

        User user1 = userService.loginCheck(user);
        System.out.println("ControllerloginCheck开始");
        if (user1 != null) {
            System.out.println("检测是否要自动登录");
            if (user1.getAl() == 1) {
                System.out.println("需要自动登录");
                Cookie cookie = new Cookie("autologin", user.getUsername() + ":" + user.getUserpass());
                cookie.setPath("/");
                cookie.setMaxAge(7 * 24 * 60 * 60);
                response.addCookie(cookie);
            }
            if (user1.getAl() == 0) {
                System.out.println("不需要自动登录");
            }
            session.setAttribute("userinfo", user1);
            int userid = user1.getUserid();
            session.setAttribute("userId", userid);
            System.out.println("在session保存了用户信息" + user1);
        }
        return user1 != null;
    }

    /**
     * 新用户注册
     *
     * @param user
     * @return
     */
    @RequestMapping("registerUserInfo")
    public Object registerUserInfo(@RequestBody User user) {
        //判断用户名是否为null或空字符串
        if (user.getUsername() == null || "".equals(user.getUsername())) {
            return false;
        }
        //判断密码是否为null或空字符串或者两次密码是否一致
        if (user.getUserpass() == null || "".equals(user.getUserpass()) || !user.getUserpass().equals(user.getRepassword())) {
            return false;
        }
        //新用户注册前先查询是否已经注册
        String userName = userService.checkUserName(user.getUsername());
        System.out.println(userName);
        //若用户名不存在则注册
        if (userName == null) {
            boolean b = userService.registerUserInfo(user);
            System.out.println(b);
            return b;
        } else {
            return false;
        }
    }

    /**
     *判断是否登录 获取session中的userinfo
     * @param session
     * @return
     */
    @RequestMapping("checkIfLogin")
    public Object checkIfLogin(HttpSession session) {
        System.out.println("开始UserController");
        User userinfo = (User) session.getAttribute("userinfo");
        System.out.println("获取session中的userinfo:" + userinfo);
        return userinfo;
    }

    /**
     * 注销
     * @return
     */
    @RequestMapping("logOut")
    public Object logOut(HttpServletResponse response){
        //覆盖掉之前的cookie
        Cookie cookie = new Cookie("autologin", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return cookie;
    }
}
