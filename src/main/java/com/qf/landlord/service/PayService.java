package com.qf.landlord.service;

import com.qf.landlord.pojo.OrderForm;
import org.springframework.stereotype.Service;

@Service
public interface PayService {
    public String payStart(OrderForm orderForm);
    public OrderForm generateOrder(OrderForm orderForm);
}
