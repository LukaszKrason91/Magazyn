package com.example.Warehouse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WarehouseDto {
    private int warehouseId;
    private String WarehouseName;

    public WarehouseDto(String warehouseName) {
        WarehouseName = warehouseName;
    }
}
