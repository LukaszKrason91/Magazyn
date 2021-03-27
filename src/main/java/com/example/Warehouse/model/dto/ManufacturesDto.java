package com.example.Warehouse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManufacturesDto {
    private int manufactureId;
    private String manufacturerName;

    public ManufacturesDto(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
}
