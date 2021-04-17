package com.example.Warehouse.service.implementation;

import com.example.Warehouse.model.Manufacturer;
import com.example.Warehouse.model.dto.ManufacturerDTO;
import com.example.Warehouse.repositories.ManufacturerRepository;
import com.example.Warehouse.service.ManufacturerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ManufacturerServiceImpl implements ManufacturerService {
    @Autowired
    private ManufacturerRepository manufacturerRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ManufacturerDTO> findAll() {
        return manufacturerRepository.findAll().stream()
                .map(manufacturer -> modelMapper.map(manufacturer, ManufacturerDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ManufacturerDTO createManufacturer(ManufacturerDTO manufacturerDTO) {
        return null;
    }

    @Override
    public void deleteManufacturer(int manufacturerId) {

    }

    @Override
    public ManufacturerDTO findManufacturerById(int manufacturerId) {
        return null;
    }

    @Override
    public Manufacturer getManufacturerEntity(int manufacturerId) {
        return null;
    }
}
