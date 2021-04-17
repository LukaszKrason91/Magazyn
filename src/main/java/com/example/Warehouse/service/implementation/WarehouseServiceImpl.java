package com.example.Warehouse.service.implementation;

import com.example.Warehouse.model.Warehouse;
import com.example.Warehouse.model.dto.WarehouseDTO;
import com.example.Warehouse.repositories.WarehouseRepository;
import com.example.Warehouse.service.WarehouseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<WarehouseDTO> findAll() {
        return warehouseRepository.findAll().stream()
                .map(warehouse -> modelMapper.map(warehouse, WarehouseDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public WarehouseDTO create(WarehouseDTO warehouseDTO) {
        warehouseRepository.save(modelMapper.map(warehouseDTO, Warehouse.class));
        return warehouseDTO;
    }

    @Override
    public void deleteWarehouse(int warehouseId) {

    }

    @Override
    public WarehouseDTO findByWarehouseId(int warehouseId) {
        return null;
    }

    @Override
    public Warehouse getWarehouseEntity(int warehouseId) {
        return null;
    }
}
