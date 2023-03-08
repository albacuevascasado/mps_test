package com.mps.persistency_layer.controllers;

import com.mps.data_model.models.prueba.Product;
import com.mps.persistency_layer.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    //final: can not be referred to other object
    private final ProductService productService;

    @Autowired //instantiate + inject into the constructor
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
//    public ResponseEntity getAllProducts() {
//        return ResponseEntity.ok(this.productRepository.findAll());
//    }
    public List<Product> getAllProducts() {
        return this.productService.getProducts();
    }

    @GetMapping("/{id}")
//    public ResponseEntity getOneProduct(@PathVariable Long id) {
//        return  ResponseEntity.ok(this.productRepository.findById(id).get());
//    }
    public Product getOneProduct(@PathVariable Long id) {
        return this.productService.getProduct(id);
    }

    @PostMapping
//    public ResponseEntity createProduct(@RequestBody Product product) {
//        return ResponseEntity.status(201).body(this.productRepository.save(product));
//    }
    public void createProducts(@RequestBody List<Product> products) {
         this.productService.createProducts(products);
    }

    @PostMapping ("/add")
    public String createProduct(@RequestBody Product product) {
        return this.productService.createProduct(product);
    }

    @PutMapping ("/{id}")
    public void updateProduct(@PathVariable Long id,
                              @RequestParam (required = false) String name,
                              @RequestParam (required = false) String description) {
        productService.updateProduct(id, name, description);
    }

    @DeleteMapping("/{id}")
//    public ResponseEntity deleteProduct(@PathVariable Long id) {
//        Product productDeleted = this.productRepository.findById(id).get();
//        this.productRepository.deleteById(id);
//        return  ResponseEntity.ok("This product has been deleted: "+ productDeleted.getName() );
//    }
    public String deleteProduct(@PathVariable Long id) {
        return this.productService.deleteProduct(id);
    }



}

