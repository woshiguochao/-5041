package com.qf.vo;

import lombok.Data;

@Data
public class GoodsVO {
    int id;
    String goodsName;
    String goodsType;
    String goodsDesc;
    int goodsPrice;
    int status;
    String Url;
}
