package com.example.Warehouse.repositories;

import com.example.Warehouse.model1.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
