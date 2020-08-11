package com.qf.vo;

import java.util.Date;

public class BuyOrderVO {
    int goodsid;
    int userid;
    String orderno;
    String goodspic;
    String goodsname;
    String goodscontent;
    long goodsprice;
    int goodscount;
    long sumprice;
    Date createtime;

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

    public long getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(long goodsprice) {
        this.goodsprice = goodsprice;
    }

    public int getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(int goodscount) {
        this.goodscount = goodscount;
    }

    public long getSumprice() {
        return sumprice;
    }

    public void setSumprice(long sumprice) {
        this.sumprice = sumprice;
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "BuyOrderVO{" +
                "goodsid=" + goodsid +
                ", userid=" + userid +
                ", orderno='" + orderno + '\'' +
                ", goodspic='" + goodspic + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", goodscontent='" + goodscontent + '\'' +
                ", goodsprice=" + goodsprice +
                ", goodscount=" + goodscount +
                ", sumprice=" + sumprice +
                ", createtime=" + createtime +
                '}';
    }
}
