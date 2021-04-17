package com.example.Warehouse.model;

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
@Table
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int warehouseId;
    @Column
    @NotNull
    private String warehouseName;
    @OneToMany(mappedBy = "warehouses")
    private Set<WarehouseHasProduct> warehouseHasProductSet;
}
