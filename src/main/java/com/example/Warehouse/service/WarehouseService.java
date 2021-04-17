package com.example.Warehouse.service;

import com.example.Warehouse.model.Warehouse;
import com.example.Warehouse.model.dto.WarehouseDTO;

import java.util.List;

public interface WarehouseService {
    List<WarehouseDTO> findAll();

    WarehouseDTO create(WarehouseDTO warehouseDTO);

    void deleteWarehouse(int warehouseId);

    WarehouseDTO findByWarehouseId(int warehouseId);

    Warehouse getWarehouseEntity (int warehouseId);
}
