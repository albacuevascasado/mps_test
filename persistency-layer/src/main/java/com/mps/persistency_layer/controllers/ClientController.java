package com.mps.persistency_layer.controllers;

import com.mps.data_model.models.prueba.Client;
//import com.mps.data_model.models.prueba.DetailsClient;
import com.mps.persistency_layer.services.ClientService;
//import com.mps.persistency_layer.services.DetailsClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;
    //@Autowired
    //private DetailsClientService detailsClientService;

    @PostMapping("/add")
    public  void createClient(@RequestBody Client client) {
        this.clientService.createClient(client);
    }

    @GetMapping
    public List<Client> getAllClients() { return this.clientService.getClients(); }

    @GetMapping("/{firstName}")
    public Client getOneClient(@PathVariable String firstName) { return this.clientService.getClient(firstName); }

/*
    @PostMapping("/add/details")
    public void createDetailsClient(@RequestBody DetailsClient detailsClient) {
        this.detailsClientService.createDetailsClient(detailsClient);
    }

 */

    @GetMapping("/details/{firstName}")
    //public List<DetailsClient> getDetails() { return  this.detailsClientService.getDetailsClient(); }
    public Object getDetails(@PathVariable String firstName) { return  this.clientService.getDetails(firstName); }

    /*
    @GetMapping("/{firstName}")
    public Client getClient(@PathVariable String firstName) { return this.clientService.getClient(firstName); }

     */

}
