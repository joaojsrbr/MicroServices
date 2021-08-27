package com.jsr.experts.productcatalog.repository;

import com.jsr.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface productRepository extends CrudRepository<Product, Integer> {



}
