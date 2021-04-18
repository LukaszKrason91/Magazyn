package com.example.Warehouse.controller;

import com.example.Warehouse.model.dto.WarehouseDTO;
import com.example.Warehouse.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping("/warehouse")
    public List<WarehouseDTO> findAll() {
        return warehouseService.findAll();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public WarehouseDTO create(@Valid @RequestBody WarehouseDTO warehouseDTO) {
        return warehouseService.create(warehouseDTO);
    }

    @DeleteMapping("/{warehouseId}")
    public  void deleteWarehouse(@PathVariable int warehouseId){
        warehouseService.deleteWarehouse(warehouseId);
    }

    @GetMapping("/warehouseId}")
    public WarehouseDTO findByWarehouseId(@PathVariable int warehouseId){
        return warehouseService.findByWarehouseId(warehouseId);
    }
}
