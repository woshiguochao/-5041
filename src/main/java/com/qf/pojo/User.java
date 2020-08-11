package com.qf.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    int userid;
    String username;
    String userpass;
    String useraddress;
    String repassword;
    String userphone;
    int userstatus;
    Date createtime;
    //传值 是否自动登录
    int al;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public int getUserStatus() {
        return userstatus;
    }

    public void setStatus(int status) {
        this.userstatus = userstatus;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public int getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(int userstatus) {
        this.userstatus = userstatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", useraddress='" + useraddress + '\'' +
                ", repassword='" + repassword + '\'' +
                ", userphone='" + userphone + '\'' +
                ", userstatus=" + userstatus +
                ", createtime=" + createtime +
                '}';
    }

}
