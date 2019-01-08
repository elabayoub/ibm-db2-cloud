package com.ecommerce.microcommerce.repositories;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findOneById(Long id);
}
