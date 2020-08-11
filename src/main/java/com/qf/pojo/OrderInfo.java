package com.qf.pojo;

import lombok.Data;

@Data
public class OrderInfo {
    private int orderinfoid;
    private int userid;
    private int cartid;
    private String orderno;
    private String sumprice;
    private int goodscount;
    private int paymoney; 
}
