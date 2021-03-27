package com.example.Warehouse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturnsDto {
    private int returnId;
    private int returnQuantity;

    public ReturnsDto(int returnQuantity) {
        this.returnQuantity = returnQuantity;
    }
}
