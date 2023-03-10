package com.mps.persistency_layer.services;

import com.mps.data_model.models.prueba.Product;
import com.mps.persistency_layer.repositories.prueba.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.OrderBy;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductService {

    //final: can not be referred to other object
    private final ProductRepository productRepository;

    @Autowired //instantiate + inject into the constructor
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return this.productRepository.findAll();
    }

    public Product getProduct(Long id) {
        return  this.productRepository.findById(id).get();
    }

    public void createProducts(List<Product> products) {

        for (Product a : products) {
            Product productByName = this.productRepository.findProductByName(a.getName());
            if (productByName != null) {
                a.setId(productByName.getId());
                this.productRepository.save(a);
            }
            this.productRepository.save(a);
        }

    }

    public String createProduct(Product product) {
        /*
        //Optional<Product> productByEmail = this.productRepository.findProductByEmail(product.getEmail());

        Product productByName = this.productRepository.findProductByName(product.getName());
        if (productByName != null) {
            //throw new IllegalStateException("the following email "+ product.getEmail()+" already exists.");
            product.setId(productByName.getId());
            this.productRepository.save(product);
            return "Product already in database " + product.getId();
        }

         */
         this.productRepository.save(product);
         return "New Product " + product.getId();

    }

    public String deleteProduct(Long id) {

        Boolean exists = this.productRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Product with ID: "+ id +" does not exist.");
        }
        Product productDeleted = this.productRepository.findById(id).get();
        this.productRepository.deleteById(id);
        return "This product has been deleted: "+ productDeleted.getName();

    }


    @Transactional //use the setters WITHOUT the need for querys
    public void updateProduct(Long id, String name, String description) {

        try {
            Product product = this.productRepository.findById(id).get();
            System.out.println("Name: "+ name);
            if (name != null && name.length() > 0 && !Objects.equals( product.getName(), name)) {
                product.setName(name);
            }
            System.out.println("Product: "+ product.getName());
            if (description != null && description.length() > 0) {
                product.setDescription(description);
            }
        } catch (Exception e) {
            throw new IllegalStateException("Product with ID: "+ id +" does not exist.");
        }

    }

}
