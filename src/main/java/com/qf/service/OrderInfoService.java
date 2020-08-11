package com.qf.service;

import com.qf.pojo.OrderInfo;
import com.qf.vo.OrderInfoVO;
import com.qf.vo.ShipaddressVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderInfoService {
    //接受购物车发来的订单信息
    public Object addOrderFromCart(OrderInfo orderInfo);
    public Object addOrderFromCart2(OrderInfo orderInfo);
    public List<OrderInfoVO> selectOrderInfo(int orderid);

    public List<ShipaddressVO> selectshipaddress(int userid);
}
