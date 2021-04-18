package com.example.Warehouse.repositories;

import com.example.Warehouse.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findProductByProductName(String productName);
}
