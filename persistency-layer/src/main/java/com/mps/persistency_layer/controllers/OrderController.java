package com.mps.persistency_layer.controllers;

import com.mps.data_model.models.prueba.Costs;
import com.mps.data_model.models.prueba.Order;
import com.mps.persistency_layer.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public void createOrder(@RequestBody Order order) { this.orderService.createOrder(order); }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {
        return this.orderService.deleteOrder(id);
    }

    @GetMapping
    public List<Order> getOrders() { return  this.orderService.getOrders(); }

    @PostMapping ("/costs")
    public void createCost(@RequestBody Costs costs) { this.orderService.createCost(costs); }

}
