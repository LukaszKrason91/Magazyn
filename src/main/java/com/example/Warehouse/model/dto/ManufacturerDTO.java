package com.example.Warehouse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManufacturerDTO {
    private int manufacturerId;
    private String manufacturerName;

    public ManufacturerDTO(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
}
