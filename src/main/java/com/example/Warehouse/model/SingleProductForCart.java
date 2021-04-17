package com.example.Warehouse.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class SingleProductForCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int spfcId;
    @Column
    @NotNull
    private int spfcQuantity;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
    @ManyToOne
    @JoinColumn(name = "whp_id")
    private WarehouseHasProduct warehouseHasProduct;

}
