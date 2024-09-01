package com.solutio.solutio.repositories;

import com.solutio.solutio.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
