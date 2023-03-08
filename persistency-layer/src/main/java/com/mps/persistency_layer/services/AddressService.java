package com.mps.persistency_layer.services;

import com.mps.data_model.models.prueba.Address;
import com.mps.data_model.models.prueba.Client;
import com.mps.data_model.models.prueba.Product;
import com.mps.persistency_layer.repositories.prueba.AddressRepository;
import com.mps.persistency_layer.repositories.prueba.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public void createAddress(Address address) {
        //Client client = new Client(address.getClient().getFirstName() , address.getClient().getLastName());
        //Address addressDB = new Address(address.getCity() , client);
        this.addressRepository.save(address);
    }

    public List<Address> getAddress() { return this.addressRepository.findAll(); }

    public String deleteAddress(Long id) {

        Boolean exists = this.addressRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Address with ID: "+ id +" does not exist.");
        }
        Address addressDeleted = this.addressRepository.findById(id).get();
        this.addressRepository.deleteById(id);
        return "This Address has been deleted: "+ addressDeleted.getId();
    }

}
