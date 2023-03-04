package com.springcloud.orderservice.service;

import com.springcloud.orderservice.dto.OrderDto;
import com.springcloud.orderservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
