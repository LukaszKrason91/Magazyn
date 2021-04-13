package com.example.Warehouse.model1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private int productId;
    private String productName;
    private double productPrice;

    public ProductDTO(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
