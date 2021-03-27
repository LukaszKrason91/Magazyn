package com.example.Warehouse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private int productId;
    private long productQuantity;
    private String productStatus;
    private double productPrice;
    private double productDiscount;
    private int ProductDiscountExist;
    private String productCol;

    public ProductDto(long productQuantity, String productStatus, double productPrice,
                      double productDiscount, int productDiscountExist,
                      String productCol) {
        this.productQuantity = productQuantity;
        this.productStatus = productStatus;
        this.productPrice = productPrice;
        this.productDiscount = productDiscount;
        ProductDiscountExist = productDiscountExist;
        this.productCol = productCol;
    }
}
