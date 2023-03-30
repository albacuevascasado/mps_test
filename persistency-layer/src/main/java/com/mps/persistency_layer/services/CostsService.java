package com.mps.persistency_layer.services;

import com.mps.data_model.models.prueba.Costs;
import com.mps.data_model.models.prueba.Orders;
import com.mps.persistency_layer.repositories.prueba.CostsRepository;
import com.mps.persistency_layer.repositories.prueba.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class CostsService {

    @Autowired
    CostsRepository costsRepository;

    @Autowired
    OrdersRepository ordersRepository;

    public void createCost(Costs costs) { this.costsRepository.save(costs); }

    public List<Costs> getAllCosts() { return this.costsRepository.findAll(); }

    public Long getIdLastOrder() {
        //return this.ordersRepository.findFirstByOrderByIdDesc();
        List<Long> idOrders = this.ordersRepository.findFirstByOrderByIdDesc();
        System.out.println("List of Id" + idOrders);
        return idOrders.get(0);
    }

    /*
    public String getOrderCodeLastOrder() {
        List<String> orderCodeOrders = this.ordersRepository.findFirstByOrderByOrderCodeDesc();
        System.out.println("List of Order Code" + orderCodeOrders);
        //return orderCodeOrders.get(0);
        List<Long> idOrders = this.ordersRepository.findFirstByOrderByIdDesc();
        String orderCodeLastOrder = this.ordersRepository.findOrderCodeById(idOrders.get(0));
        return orderCodeLastOrder;
    }
     */

}
