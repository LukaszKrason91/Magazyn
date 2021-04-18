package com.example.Warehouse.repositories;

import com.example.Warehouse.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {

    Optional<Manufacturer> findManufacturerByName(String manufacturerName);
}
