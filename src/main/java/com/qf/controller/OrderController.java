package com.qf.controller;
import com.qf.pojo.Order;
import com.qf.pojo.OrderInfo;
import com.qf.service.OrderService;
import com.qf.vo.BuyOrderVO;
import com.qf.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping("selectOrderByUserId")
    public Object selectOrderByUserId(HttpSession session){
        List<OrderVO> orderVOS = orderService.selectOrderByUserId((Integer)session.getAttribute("userId"));
        System.out.println("selectOrderByUserId");
        return orderVOS;
    }
    @RequestMapping("selectUnpayOrder")
    public List<OrderVO> selectUnpayOrder(HttpSession session){
        System.out.println("selectUnpayOrder");
        List<OrderVO> orderVOS = orderService.selectUnpayOrder((Integer)session.getAttribute("userId"));
        return orderVOS;
    }
    @RequestMapping("deleteOrder")
    public Object deleteOrder(@RequestParam int orderid){
        System.out.println("deleteOrder");
        boolean b = orderService.deleteOrder(orderid);
        return b;
    }

    /**
     * 通过userid拿出结算后的订单
     * @param session
     * @return
     */
    @RequestMapping("selectBuyOrderInfo")
    public Object selectBuyOrderInfo(HttpSession session){
        List<BuyOrderVO> buyOrderVOS = orderService.selectBuyOrderInfo((Integer)session.getAttribute("userId"));

        BuyOrderVO buyOrderVO = buyOrderVOS.get(0);

        System.out.println("!11111111"+buyOrderVO);
        return buyOrderVO;
    }

    /**
     * 购物车结算插入信息
     * @param order
     * @return
     */
    @RequestMapping("addOrderFromCart2")
    public Object addOrderFromCart2(@RequestBody Order order){
        Object o = this.orderService.addOrderFromCart2(order);
        System.out.println("addOrderFromCart2:加入order");
        return o;
    }

}

