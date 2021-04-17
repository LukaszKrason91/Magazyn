package com.example.Warehouse.services;

import com.example.Warehouse.model1.Warehouse;
import com.example.Warehouse.model1.dto.WarehouseDTO;

import java.util.List;

public interface WarehouseService {
    List<WarehouseDTO> findAll();

    WarehouseDTO create(WarehouseDTO warehouseDTO);

    void deleteWarehouse(int warehouseId);

    WarehouseDTO findByWarehouseId(int warehouseId);

    Warehouse getWarehouseEntity (int warehouseId);


}
