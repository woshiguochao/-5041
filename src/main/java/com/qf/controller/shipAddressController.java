package com.qf.controller;

import com.qf.pojo.shipAddress;
import com.qf.service.shipAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class shipAddressController {
    @SuppressWarnings("all")
    @Autowired
    shipAddressService shipaddressService;
    //获取全部地址信息
    @RequestMapping("getAddress")
    public Object getAddress(){
        return shipaddressService.getAddress();
    }
    //获取指定ID的地址信息
    @RequestMapping("getAddressById")
    public Object getAddressById(@RequestParam int shipaddrid){
        return shipaddressService.getAddressById(shipaddrid);
    }
    //添加地址信息
    @RequestMapping("editAddress")
    public boolean editAddress(@RequestBody shipAddress shipaddress){
        boolean b = shipaddressService.editAddress(shipaddress);
        return b;
    }
    //删除地址信息
    @RequestMapping("deleteAddressById")
    public boolean deleteAddressById(@RequestParam int shipaddrid){
        boolean b = shipaddressService.deleteAddressById(shipaddrid);
        return b;
    }
    //修改地址信息
    @RequestMapping("updateAddressById")
    public boolean updateAddressById(@RequestBody shipAddress shipaddress){
        boolean b = shipaddressService.updateAddressById(shipaddress);
        return b;
    }
    //修改默认地址
    @RequestMapping("updateStatus")
    public boolean updateStatus(@RequestBody shipAddress shipaddress){
        boolean b = shipaddressService.updateStatus(shipaddress);
        return b;
    }
}
