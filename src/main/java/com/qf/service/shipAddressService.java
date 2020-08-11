package com.qf.service;

import com.qf.pojo.shipAddress;

import java.util.List;

public interface shipAddressService {
    //获取全部地址信息
    public List<shipAddress> getAddress();
    //获取指定ID的地址信息
    public shipAddress getAddressById(int shipaddrid);
    //添加地址信息
    public boolean editAddress(shipAddress shipaddress);
    //删除地址信息
    public boolean deleteAddressById(int shipaddrid);
    //修改地址信息
    public boolean updateAddressById(shipAddress shipaddress);
    //修改默认地址
    public boolean updateStatus(shipAddress shipaddress);
}
