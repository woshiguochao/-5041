package com.qf.landlord.dao;

import com.qf.landlord.pojo.OrderForm;

public interface PayMapper {
    public String payStart(OrderForm orderForm);
    public OrderForm generateOrder(OrderForm orderForm);
}
