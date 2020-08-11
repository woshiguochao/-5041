package com.qf.dto;

import com.qf.pojo.GoodsInfo;
import lombok.Data;

@Data
public class UserGoodsDTO {
    private int userid;
    private GoodsInfo goodsInfo;
}
