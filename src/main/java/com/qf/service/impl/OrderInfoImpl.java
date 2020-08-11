package com.qf.service.impl;


import com.qf.dao.OrderInfoMapper;
import com.qf.pojo.OrderInfo;
import com.qf.service.OrderInfoService;
import com.qf.vo.OrderInfoVO;
import com.qf.vo.ShipaddressVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderInfoImpl implements OrderInfoService {
    @Autowired
    OrderInfoMapper orderInfoMapper;

    public Object addOrderFromCart(OrderInfo orderInfo) {
        return orderInfoMapper.addOrderFromCart(orderInfo);
    }

    public Object addOrderFromCart2(OrderInfo orderInfo) {
        return orderInfoMapper.addOrderFromCart2(orderInfo);
    }

    public List<OrderInfoVO> selectOrderInfo(int orderid) {
        List<OrderInfoVO> orderInfoVOS = orderInfoMapper.selectOrderInfo(orderid);
        return orderInfoVOS;
    }

    public List<ShipaddressVO> selectshipaddress(int userid) {
        List<ShipaddressVO> shipaddress = orderInfoMapper.selectshipaddress(userid);
        return shipaddress;
    }
}
