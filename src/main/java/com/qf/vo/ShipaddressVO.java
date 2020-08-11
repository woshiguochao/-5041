package com.qf.vo;

public class ShipaddressVO {
    int shipaddrid;
    int userid;
    int status;
    String shipname;
    String shipphone;
    String province;
    String city;
    String addressdetail;
    String email;

    public int getShipaddrid() {
        return shipaddrid;
    }

    public void setShipaddrid(int shipaddrid) {
        this.shipaddrid = shipaddrid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname;
    }

    public String getShipphone() {
        return shipphone;
    }

    public void setShipphone(String shipphone) {
        this.shipphone = shipphone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressdetail() {
        return addressdetail;
    }

    public void setAddressdetail(String addressdetail) {
        this.addressdetail = addressdetail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ShipaddressVO{" +
                "shipaddrid=" + shipaddrid +
                ", userid=" + userid +
                ", status=" + status +
                ", shipname='" + shipname + '\'' +
                ", shipphone='" + shipphone + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", addressdetail='" + addressdetail + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
