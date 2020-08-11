package com.qf.vo;

import java.util.Date;

public class OrderInfoVO {
    int orderid;
    int orderno;
    long goodsprice;
    long paymoney;
    int orderstatus;
    int goodscount;
    int shipstatus;
    String shiptime;
    String createtime;
    String goodspic;
    String goodsname;
    String goodscontent;


    public int getOrderno() {
        return orderno;
    }

    public void setOrderno(int orderno) {
        this.orderno = orderno;
    }

    public long getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(long goodsprice) {
        this.goodsprice = goodsprice;
    }

    public long getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(long paymoney) {
        this.paymoney = paymoney;
    }

    public int getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(int orderstatus) {
        this.orderstatus = orderstatus;
    }

    public int getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(int goodscount) {
        this.goodscount = goodscount;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getGoodspic() {
        return goodspic;
    }

    public void setGoodspic(String goodspic) {
        this.goodspic = goodspic;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodscontent() {
        return goodscontent;
    }

    public void setGoodscontent(String goodscontent) {
        this.goodscontent = goodscontent;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getShipstatus() {
        return shipstatus;
    }

    public void setShipstatus(int shipstatus) {
        this.shipstatus = shipstatus;
    }

    public String getShiptime() {
        return shiptime;
    }

    public void setShiptime(String shiptime) {
        this.shiptime = shiptime;
    }

    @Override
    public String toString() {
        return "OrderInfoVO{" +
                "orderid=" + orderid +
                ", orderno=" + orderno +
                ", goodsprice=" + goodsprice +
                ", paymoney=" + paymoney +
                ", orderstatus=" + orderstatus +
                ", goodscount=" + goodscount +
                ", shipstatus=" + shipstatus +
                ", shiptime='" + shiptime + '\'' +
                ", createtime='" + createtime + '\'' +
                ", goodspic='" + goodspic + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", goodscontent='" + goodscontent + '\'' +
                '}';
    }
}
