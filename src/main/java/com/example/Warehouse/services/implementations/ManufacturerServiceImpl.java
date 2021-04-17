package com.example.Warehouse.services.implementations;

import com.example.Warehouse.exceptions.ManufacturerNotFoundException;
import com.example.Warehouse.model1.Manufacturer;
import com.example.Warehouse.model1.dto.ManufacturerDTO;
import com.example.Warehouse.repositories.ManufacturerRepository;
import com.example.Warehouse.services.ManufacturerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @Override
    public List<ManufacturerDTO> findAll() {

        return manufacturerRepository.findAll().stream()
                .map(manufacturer -> modelMapper.map(manufacturer, ManufacturerDTO.class)).collect(Collectors.toList());
    }

    @Override
    public ManufacturerDTO createManufacturer(ManufacturerDTO manufacturerDTO) {

        manufacturerRepository.save(modelMapper.map(manufacturerDTO,Manufacturer.class));
        return manufacturerDTO;
    }

    @Override
    public void deleteManufacturer(int manufacturerId) {manufacturerRepository.deleteById(manufacturerId);

    }

    @Override
    public ManufacturerDTO findManufacturerById(int manufacturerId) {
       return modelMapper.map(manufacturerRepository.findById(manufacturerId)
               .orElseThrow(ManufacturerNotFoundException::new),ManufacturerDTO.class);
    }

    @Override
    public Manufacturer getManufacturerEntity(int manufacturerId) {

        return  manufacturerRepository.findById(manufacturerId).orElseThrow(ManufacturerNotFoundException::new);
    }
}
