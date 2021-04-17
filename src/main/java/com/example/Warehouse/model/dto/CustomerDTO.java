package com.example.Warehouse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerEmail;

    public CustomerDTO(String customerName, String customerAddress, String customerEmail) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
    }
}
