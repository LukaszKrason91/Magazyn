package com.example.Warehouse.service.implementation;

import com.example.Warehouse.exceptions.WarehouseNotFoundException;
import com.example.Warehouse.model.Warehouse;
import com.example.Warehouse.model.dto.WarehouseDTO;
import com.example.Warehouse.repositories.WarehouseRepository;
import com.example.Warehouse.service.WarehouseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
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
        warehouseRepository.deleteById(warehouseId);
    }

    @Override
    public WarehouseDTO findByWarehouseId(int warehouseId) {
        return modelMapper.map(warehouseRepository.findById(warehouseId)
                .orElseThrow(WarehouseNotFoundException::new), WarehouseDTO.class);
    }

    @Override
    public Warehouse getWarehouseEntity(int warehouseId) {
        return warehouseRepository.findById(warehouseId).orElseThrow(WarehouseNotFoundException::new);
    }

    @Override
    public WarehouseDTO findWarehouseByName(String warehouseName) {
        return warehouseRepository.findWarehouseByName(warehouseName)
                .map(warehouse -> modelMapper.map(warehouse, WarehouseDTO.class))
                .orElseThrow();
    }
}
