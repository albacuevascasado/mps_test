package com.mps.persistency_layer.services;

import com.mps.data_model.models.prueba.Client;
import com.mps.persistency_layer.repositories.prueba.AddressRepository;
import com.mps.persistency_layer.repositories.prueba.ClientRepository;
//import com.mps.persistency_layer.repositories.prueba.ProductRepository;
//import com.mps.persistency_layer.repositories.prueba.DetailsClientRepository;
import com.mps.persistency_layer.repositories.prueba.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
    //@Autowired
    //private ProductRepository productRepository;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    OrdersRepository ordersRepository;

    public void createClient(Client client) {
        Optional<Client> productByEmail = this.clientRepository.findClientByEmail(client.getEmail());

        if (productByEmail.isPresent()) {
            throw new IllegalStateException("the following email "+ client.getEmail()+" already exists.");
        }
        /*
        for (int i = 0; i < client.getOrders().size(); i++) {
            this.orderRepository.save(client.getOrders().get(i));
        }
         */
        this.clientRepository.save(client);

/*
         for (Product a : client.getProduct()) {
            Product productByName = this.productRepository.findProductByName(a.getName());
            if (productByName != null) {
                a.setId(productByName.getId());
                this.clientRepository.save(client);
            }
            this.clientRepository.save(client);
        }

/*

        Product productByName = this.productRepository.findProductByName(client.getProduct().getName());
        if(productByName != null) {
            client.getProduct().setId(productByName.getId());
            this.clientRepository.save(client);
            //return "Product already in database " + client.getProduct().getId();
        }

 */
        //this.clientRepository.save(client);

        //return "New Client " + client.getFirstName() + "Product " + client.getProduct().getId();

    }

    public List<Client> getClients() { return this.clientRepository.findAll(); }

    public Client getClient(String firstName) { return this.clientRepository.findClientByName(firstName); }

    public Object getDetails(String firstName) { return this.clientRepository.findClientDetailsByName(firstName); }
}
