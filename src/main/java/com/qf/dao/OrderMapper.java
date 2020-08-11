package com.qf.dao;



import com.qf.pojo.Order;
import com.qf.vo.BuyOrderVO;
import com.qf.vo.OrderVO;

import java.util.List;

public interface OrderMapper {
    public List<OrderVO> selectOrderByUserId(int userid);

    public List<OrderVO> selectUnpayOrder(int userid);

    public int deleteOrder(int orderid);

    public List<BuyOrderVO> selectBuyOrderInfo(int userid);
    public Object addOrderFromCart2(Order order);

//    public int inertOrderInfo(BuyOrderVO buyOrderVO);
}
