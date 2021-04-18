package com.example.Warehouse.service;

import com.example.Warehouse.model.Manufacturer;
import com.example.Warehouse.model.dto.ManufacturerDTO;

import java.util.List;

public interface ManufacturerService {
    List<ManufacturerDTO> findAll();

    ManufacturerDTO createManufacturer(ManufacturerDTO manufacturerDTO);

    void deleteManufacturer(int manufacturerId);

    ManufacturerDTO findManufacturerById(int manufacturerId);

    Manufacturer getManufacturerEntity(int manufacturerId);

    ManufacturerDTO findManufacturerByName(String manufacturerName);
}
