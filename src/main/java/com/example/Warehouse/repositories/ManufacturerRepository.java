package com.example.Warehouse.repositories;

import com.example.Warehouse.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {

    Optional<Manufacturer> findManufacturerByManufacturerName(String manufacturerName);
}
