package com.example.Warehouse.controller;

import com.example.Warehouse.model.dto.ManufacturerDTO;
import com.example.Warehouse.service.ManufacturerService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/manufacturer")
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;

    @GetMapping("/manufacturer")
    public List<ManufacturerDTO> findAll(){
        return manufacturerService.findAll();
    }

    @GetMapping("/{manufacturerId}")
    public ManufacturerDTO findManufacturerById(@PathVariable int manufacturerId){
        return manufacturerService.findManufacturerById(manufacturerId);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ManufacturerDTO createManufacturer(@Valid @RequestBody ManufacturerDTO manufacturerDTO){
        return manufacturerService.createManufacturer(manufacturerDTO);
    }

    @DeleteMapping("/{manufacturerId}")
    public void deleteManufacturer(@PathVariable int manufacturerId){
        manufacturerService.deleteManufacturer(manufacturerId);
    }

}
