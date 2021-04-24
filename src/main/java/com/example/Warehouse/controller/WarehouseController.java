package com.example.Warehouse.controller;

import com.example.Warehouse.model1.Warehouse;
import com.example.Warehouse.model1.dto.WarehouseDTO;
import com.example.Warehouse.services.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/warehouses")
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    @GetMapping("/warehouses")
    public List<WarehouseDTO> findAll(){
        return warehouseService.findAll();
    }
    @GetMapping ("/{warehouseId}")
    public WarehouseDTO findByWarehouseId(@PathVariable int warehouseId){
        return warehouseService.findByWarehouseId(warehouseId);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public WarehouseDTO create(@Valid@RequestBody WarehouseDTO warehouseDTO){
        return warehouseService.create(warehouseDTO);
    }
    @DeleteMapping("/{warehouseId}")
    public void deleteWarehouse(@PathVariable int warehouseId){
        warehouseService.deleteWarehouse(warehouseId);
    }
}
