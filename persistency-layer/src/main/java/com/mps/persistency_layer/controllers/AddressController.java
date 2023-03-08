package com.mps.persistency_layer.controllers;

import com.mps.data_model.models.prueba.Address;
import com.mps.persistency_layer.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping(value = "/add")
    public void createAddress(@RequestBody Address address) { this.addressService.createAddress(address); }

    @GetMapping
    public List<Address> getAddress() { return this.addressService.getAddress(); }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id) { this.addressService.deleteAddress(id); }

}
