package com.example.Warehouse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    private int cartId;
    private String cartName;
    private int orderedQuantity;

    public CartDto(String cartName, int orderedQuantity) {
        this.cartName = cartName;
        this.orderedQuantity = orderedQuantity;
    }
}
