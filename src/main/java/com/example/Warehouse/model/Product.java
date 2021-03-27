package com.example.Warehouse.model;

import com.jayway.jsonpath.internal.function.numeric.Min;
import com.sun.istack.NotNull;
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
    private int productId;
    @Column
    @NotNull
    private long productQuantity;
    @Column
    @NotNull
    private String productStatus;
    @Column
    @NotNull
    private double productPrice;
    @Column
    private double productDiscount;
    @Column
    private int ProductDiscountExist;
    @Column
    private String productCol;

    @OneToMany(mappedBy = "product")
    private Set<Returns> returnsSet;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;
    @ManyToOne
    @JoinColumn(name = "manufactures_id")
    private Manufactures manufactures;
    @ManyToMany(mappedBy = "productsInCart")
    private Set<Cart> cartWithProducts;
}
