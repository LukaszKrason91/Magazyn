package com.example.Warehouse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private int customerId;
    private String customerName;

    public CustomerDto(String customerName) {
        this.customerName = customerName;
    }
}
