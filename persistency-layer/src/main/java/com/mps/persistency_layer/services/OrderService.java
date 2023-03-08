package com.mps.persistency_layer.services;

import com.mps.data_model.models.prueba.Costs;
import com.mps.data_model.models.prueba.Order;
import com.mps.data_model.models.prueba.Product;
import com.mps.persistency_layer.repositories.prueba.CostsRepository;
import com.mps.persistency_layer.repositories.prueba.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CostsRepository costsRepository;

    public void createOrder(Order order) {
        this.orderRepository.save(order);
    }

    public String deleteOrder(Long id) {

        Boolean exists = this.orderRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Order with ID: "+ id +" does not exist.");
        }
        Order orderDeleted = this.orderRepository.findById(id).get();
        this.orderRepository.deleteById(id);
        return "This order has been deleted: "+ orderDeleted.getClient().getEmail();

    }

    public List<Order> getOrders() { return this.orderRepository.findAll(); }

    public void createCost(Costs cost)  { this.costsRepository.save(cost); }

}
