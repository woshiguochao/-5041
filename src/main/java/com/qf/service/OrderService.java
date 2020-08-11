package com.qf.service;



import com.qf.pojo.Order;
import com.qf.vo.BuyOrderVO;
import com.qf.vo.OrderVO;

import java.util.List;

public interface OrderService {
    public List<OrderVO> selectOrderByUserId(int userid);

    public List<OrderVO> selectUnpayOrder(int userid);

    public boolean deleteOrder(int orderid);

    public List<BuyOrderVO> selectBuyOrderInfo(int userid);
    public Object addOrderFromCart2(Order order);

//    public boolean inertOrderInfo(BuyOrderVO buyOrderVO);
}
