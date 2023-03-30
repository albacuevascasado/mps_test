package com.mps.persistency_layer.controllers;

import com.mps.data_model.models.prueba.Orders;
import com.mps.persistency_layer.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping("/add")
    public void createOrder(@RequestBody Orders order) { this.ordersService.createOrder(order); }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        this.ordersService.deleteOrder(id);
    }

    @GetMapping
    public List<Orders> getOrders() { return  this.ordersService.getOrders(); }

}
