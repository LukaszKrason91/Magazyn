package com.example.Warehouse.model1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {
    private int cartId;
    private double totalPrice;

    public CartDTO(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

