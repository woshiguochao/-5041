package com.qf.service.impl;

import com.qf.dao.shipAddressMapper;
import com.qf.pojo.shipAddress;
import com.qf.service.shipAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class shipAddressServiceImpl implements shipAddressService {
    @Autowired
    shipAddressMapper shipaddressMapper;
    //获取全部地址信息
    public List<shipAddress> getAddress() {
        return shipaddressMapper.getAddress();
    }
    //获取指定ID的地址信息
    public shipAddress getAddressById(int shipaddrid) {
        return shipaddressMapper.getAddressById(shipaddrid);
    }
    //添加地址信息
    public boolean editAddress(shipAddress shipaddress) {
        int i = shipaddressMapper.editAddress(shipaddress);
        return i>0;
    }
    //删除地址信息
    public boolean deleteAddressById(int shipaddrid) {
        int i = shipaddressMapper.deleteAddressById(shipaddrid);
        return i>0;
    }
    //修改地址信息
    public boolean updateAddressById(shipAddress shipaddress) {
        int i = shipaddressMapper.updateAddressById(shipaddress);
        return i>0;
    }
    //修改默认地址
    public boolean updateStatus(shipAddress shipaddress) {
        int i = shipaddressMapper.updateStatus(shipaddress);
        return i>0;
    }
}
