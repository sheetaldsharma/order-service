package com.eshopper.orderservice.service;

import com.eshopper.orderservice.model.Order;
import com.eshopper.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService{
    @Autowired
    OrderRepository orderRepository;

    public List<Order> getAllOrders()
    {
        return (List<Order>)orderRepository.findAll();
    }

}
