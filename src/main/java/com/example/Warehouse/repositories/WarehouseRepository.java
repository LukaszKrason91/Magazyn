package com.example.Warehouse.repositories;

import com.example.Warehouse.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

    Optional<Warehouse> findWarehouseByName(String warehouseName);
}
