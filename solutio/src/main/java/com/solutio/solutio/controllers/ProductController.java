package com.solutio.solutio.controllers;

import com.solutio.solutio.entities.Product;
import com.solutio.solutio.repositories.ProductRepository;
import com.solutio.solutio.services.ProcuctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product saveProduct = productRepository.save(product);
        return ResponseEntity.ok(saveProduct);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


}
