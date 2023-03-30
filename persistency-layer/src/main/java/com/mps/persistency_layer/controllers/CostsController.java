package com.mps.persistency_layer.controllers;

import com.mps.data_model.models.prueba.Costs;
import com.mps.data_model.models.prueba.Orders;
import com.mps.persistency_layer.repositories.prueba.CostsRepository;
import com.mps.persistency_layer.services.CostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping(value = "/costs")
public class CostsController {

    @Autowired
    CostsService costsService;
    @Autowired
    CostsRepository costsRepository;

    @PostMapping("/add")
    public void createCost(@RequestBody Costs costs) {
        //costs.setId();
        //costs.setId(this.costsService.getLastOrder());
        this.costsService.createCost(costs);
    }

    @PostMapping("/addcost_lastorder")
    public void createCostLastOrder(@RequestBody Costs costs) {
        System.out.println("LastId: " + this.costsService.getIdLastOrder());
        costs.setId(this.costsService.getIdLastOrder());
        //System.out.println("LastOrderCode: " + this.costsService.getOrderCodeLastOrder());
        //costs.setOrder_code(this.costsService.getOrderCodeLastOrder());
        this.costsService.createCost(costs);
    }


    @GetMapping
    public List<Costs> getCosts() { return this.costsService.getAllCosts(); }

    @GetMapping("/last_id_order")
    public Long getIdLastOrder() { return this.costsService.getIdLastOrder(); }
/*
    @GetMapping("/last_ordercode_order")
    public String getOrderCodeLastOrder() { return this.costsService.getOrderCodeLastOrder(); }
 */

}
