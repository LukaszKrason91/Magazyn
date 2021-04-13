package com.example.Warehouse.model1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseDTO {
    private int warehouseId;
    private String warehouseName;

    public WarehouseDTO(String warehouseName) {
        this.warehouseName = warehouseName;
    }
}
