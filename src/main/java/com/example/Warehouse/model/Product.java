package com.example.Warehouse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int productId;
    @Column
    long productQuantity;
    @Column
    String productStatus;
    @Column
    double productPrice;
    @Column
    double productDiscount;
    @Column
    int ProductDiscountExist;
    @Column
    String productCol;

    @OneToMany(mappedBy = "product")
    private Set<Returns> returnsSet;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    Warehouse warehouse;
    @ManyToOne
    @JoinColumn(name = "manufactures_id")
    Manufactures manufactures;
    @ManyToMany(mappedBy = "productsInCart")
    Set<Cart> cartWithProducts;
}
