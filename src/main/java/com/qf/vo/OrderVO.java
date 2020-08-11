package com.qf.vo;
import lombok.Data;

import java.util.Date;
@Data
public class OrderVO {
    int orderid;
    int orderno;
    long goodsprice;
    long paymoney;
    int orderstatus;
    int orderexist;
    String createtime;
    String goodspic;
    String goodsname;
    String goodscontent;
    int PageNum;

}
