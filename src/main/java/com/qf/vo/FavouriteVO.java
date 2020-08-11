package com.qf.vo;

import lombok.Data;

@Data
public class FavouriteVO {
    private int favouriteid;
    private int goodsid;
    private int userid;
    private String goodsname;
    private int goodsprice;
    private String createtime;
    private String goodspic;
    private String favouritestatus;
    int pageNum;
}
