package com.qf.pojo;
import lombok.Data;

@Data
public class GoodsInfo {
    int goodsId;
    int userId;
    String goodsName;
    String goodsPrice;
    long goodsStock;
    String goodsContent;
    String goodsPic;
    String goodsStatus;
    String goodsBrand;
}
