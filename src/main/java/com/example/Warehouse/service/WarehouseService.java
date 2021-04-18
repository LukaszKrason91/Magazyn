package com.example.Warehouse.service;

import com.example.Warehouse.model.Warehouse;
import com.example.Warehouse.model.dto.WarehouseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface WarehouseService {
    List<WarehouseDTO> findAll();

    WarehouseDTO create(WarehouseDTO warehouseDTO);

    void deleteWarehouse(int warehouseId);

    WarehouseDTO findByWarehouseId(int warehouseId);

    Warehouse getWarehouseEntity (int warehouseId);

    WarehouseDTO findWarehouseByName(String warehouseName);
}
