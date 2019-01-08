package com.ecommerce.microcommerce.services;

import com.ecommerce.microcommerce.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
    Product save(Product product);
    void delete(Long id);

}
