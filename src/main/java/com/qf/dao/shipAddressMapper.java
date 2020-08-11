package com.qf.dao;

import com.qf.pojo.shipAddress;

import java.util.List;

public interface shipAddressMapper {
    //获取全部地址信息
    public List<shipAddress> getAddress();
    //获取指定ID的地址信息
    public shipAddress getAddressById(int shipaddrid);
    //添加地址信息
    public int editAddress(shipAddress shipaddress);
    //删除地址信息
    public int deleteAddressById(int shipaddrid);
    //修改地址信息
    public int updateAddressById(shipAddress shipaddress);
    //修改默认地址
    public int updateStatus(shipAddress shipaddress);
}
