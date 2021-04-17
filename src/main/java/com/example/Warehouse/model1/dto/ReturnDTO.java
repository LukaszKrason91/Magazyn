package com.example.Warehouse.model1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnDTO {
    private int returnId;
    private int returnQuantity;

    public ReturnDTO(int returnQuantity) {
        this.returnQuantity = returnQuantity;
    }
}
