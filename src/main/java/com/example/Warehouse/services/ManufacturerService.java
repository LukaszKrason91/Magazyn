package com.example.Warehouse.services;

import com.example.Warehouse.model1.Manufacturer;
import com.example.Warehouse.model1.dto.ManufacturerDTO;

import java.util.List;

public interface ManufacturerService {
    List<ManufacturerDTO> findAll();

    ManufacturerDTO createManufacturer(ManufacturerDTO manufacturerDTO);

    void deleteManufacturer(int manufacturerId);

    ManufacturerDTO findManufacturerById(int manufacturerId);

    Manufacturer getManufacturerEntity(int manufacturerId);
}
