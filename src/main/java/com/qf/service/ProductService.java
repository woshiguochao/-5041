package com.qf.service;

import com.qf.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    /**
     * 获取所有产品列表
     * @return
     */
    List<Product> getProducts();

    /**
     * 根据产品ID查询产品详情
     * @param productId
     * @return
     */
    Product getProductById(String productId);
}