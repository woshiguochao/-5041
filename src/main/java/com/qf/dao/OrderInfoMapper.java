package com.qf.dao;

import com.qf.pojo.OrderInfo;
import com.qf.vo.OrderInfoVO;
import com.qf.vo.ShipaddressVO;

import java.util.List;


public interface OrderInfoMapper {
    //接受购物车发来的订单信息
    Object addOrderFromCart(OrderInfo orderInfo);
    Object addOrderFromCart2(OrderInfo orderInfo);
    public List<OrderInfoVO> selectOrderInfo(int orderid);

    public List<ShipaddressVO> selectshipaddress(int userid);
}
