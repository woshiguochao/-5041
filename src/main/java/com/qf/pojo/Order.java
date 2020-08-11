package com.qf.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Order {
    int orderid;
    int orderno;
    int userid;
    long paymoney;
    int orderstatus;
    Date createtime;
    Date sendtime;
    int cartid;
    int orderexist;
}
