package com.example.Warehouse.repositories;

import com.example.Warehouse.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
