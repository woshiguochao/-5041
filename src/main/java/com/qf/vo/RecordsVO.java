package com.qf.vo;

import lombok.Data;

@Data
public class RecordsVO {
    private int recordsid;
    private int userid;
    private int goodsid;
    private String goodsname;
    private int goodsprice;
    private String createtime;
    private String goodspic;
    int pageNum;
}
