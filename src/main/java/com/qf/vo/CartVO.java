package com.qf.vo;

import com.qf.pojo.GoodsInfo;
import lombok.Data;


@Data
public class CartVO { 
    private int cartid;
    private int userid;
    private int goodsid;
    private int quantity;
    private String checked;
    private int cartstatus;
    private String createtime;
    private String goodsprice;
    private String goodsname;
    private String goodspic;
}
