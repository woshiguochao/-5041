package com.qf.controller;

import com.qf.pojo.OrderInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.OrderInfoService;
import com.qf.vo.OrderInfoVO;
import com.qf.vo.ShipaddressVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class OrderInfoController {
    @Autowired
    OrderInfoService orderInfoService;
    //接受购物车发来的订单信息
    @RequestMapping("addOrderFromCart")
    public Object addOrderFromCart(@RequestBody OrderInfo orderInfo){
        Object o = this.orderInfoService.addOrderFromCart(orderInfo);
        System.out.println("addOrderFromCart:加入orderinfo");
        return o;
    }
    @RequestMapping("selectOrderInfo")
    public List<OrderInfoVO> selectOrderInfo(@RequestParam int orderid){
        List<OrderInfoVO> orderInfoVOS = orderInfoService.selectOrderInfo(orderid);
        System.out.println("selectOrderInfo");
        return orderInfoVOS;
    }
    @RequestMapping("selectshipaddress")
    public List<ShipaddressVO> selectshipaddress(HttpSession session){
        List<ShipaddressVO> shipaddress = orderInfoService.selectshipaddress((Integer)session.getAttribute("userId"));
        System.out.println("selectshipaddress");
        return shipaddress;
    }
    
}
