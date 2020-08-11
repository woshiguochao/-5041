package com.qf.service.impl;



import com.qf.dao.OrderMapper;

import com.qf.pojo.Order;
import com.qf.service.OrderService;
import com.qf.vo.BuyOrderVO;
import com.qf.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    public List<OrderVO> selectOrderByUserId(int userid) {
        List<OrderVO> orderVOS = orderMapper.selectOrderByUserId(userid);
     //   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        for (OrderVO orderVO:orderVOS){
//            String format = simpleDateFormat.format(orderVO.getCreatetime());
//
//        }
        return orderVOS;
    }

    public List<OrderVO> selectUnpayOrder(int userid) {
        List<OrderVO> orderVOS = orderMapper.selectUnpayOrder(userid);
        return orderVOS;
    }

    public boolean deleteOrder(int orderid) {
        int i = orderMapper.deleteOrder(orderid);
        return i>0;
    }

    public List<BuyOrderVO> selectBuyOrderInfo(int userid){
        List<BuyOrderVO> buyOrderVOS = orderMapper.selectBuyOrderInfo(userid);
        return buyOrderVOS;
    }

    public Object addOrderFromCart2(Order order) {
        return this.orderMapper.addOrderFromCart2(order);
    }

//    public boolean inertOrderInfo(BuyOrderVO buyOrderVO) {
//        buyOrderVO.setCreatetime(new Date());
//        System.out.println("等待插入的数据库接收到了对象="+buyOrderVO);
//        int i = orderMapper.inertOrderInfo(buyOrderVO);
//        return i>0;
//    }


}