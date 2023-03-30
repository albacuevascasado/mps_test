package com.mps.persistency_layer.services;

import com.mps.data_model.models.prueba.Orders;
import com.mps.persistency_layer.repositories.prueba.CostsRepository;
import com.mps.persistency_layer.repositories.prueba.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private CostsRepository costsRepository;

    public void createOrder(Orders order) {
        this.ordersRepository.save(order);
    }

    public void deleteOrder(Long id) {

        Boolean exists = this.ordersRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Order with ID: "+ id +" does not exist.");
        }
        Orders orderDeleted = this.ordersRepository.findById(id).get();
        this.ordersRepository.deleteById(id);
        //return "This order has been deleted: "+ orderDeleted.getClient().getEmail();

    }

    public List<Orders> getOrders() { return this.ordersRepository.findAll(); }

}
