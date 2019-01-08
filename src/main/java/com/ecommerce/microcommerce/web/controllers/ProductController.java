package com.ecommerce.microcommerce.web.controllers;

import com.ecommerce.microcommerce.repositories.ProductRepository;
import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping(value = "/products")
    public List<Product> productsList() {
        return productService.findAll();
    }

    @GetMapping(value = "/products/{id}")
    public Product productById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping(value = "/products")
    public void addProduct(@RequestBody Product product) {
        productService.save(product);
    }

    @PutMapping(value = "/products/delete/{id}")
    public void delete(@PathVariable Long id){
        productService.delete(id);
    }
}
