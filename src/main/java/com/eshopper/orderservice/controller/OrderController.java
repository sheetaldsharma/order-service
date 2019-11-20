package com.eshopper.orderservice.controller;

import com.eshopper.orderservice.model.Order;
import com.eshopper.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getAllOrders")
    public List<Order> getAllOrders()
    {
        System.out.println("size = "+ orderService.getAllOrders().size());
        return (List<Order>) orderService.getAllOrders();
    }
}