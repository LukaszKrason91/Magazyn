package com.example.Warehouse.repositories;

import com.example.Warehouse.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findProductByName(String productName);
}
