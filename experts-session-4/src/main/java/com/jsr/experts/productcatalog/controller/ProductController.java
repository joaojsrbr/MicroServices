package com.jsr.experts.productcatalog.controller;

import com.jsr.experts.productcatalog.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private com.jsr.experts.productcatalog.repository.productRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        return productRepository.save(product);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id){
        return productRepository.findById(id);


    }

    }
