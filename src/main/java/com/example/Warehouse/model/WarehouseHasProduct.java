package com.example.Warehouse.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class WarehouseHasProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "whp_id")
    private int whpId;
    @Column
    @NotNull
    private int whpQuantity;
    @ManyToOne
    @JoinColumn (name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn (name = "warehouse_id")
    private Warehouse warehouses;
    @OneToMany (mappedBy = "warehouseHasProduct")
    private Set<SingleProductForCart> singleProductForCartSet;
}
