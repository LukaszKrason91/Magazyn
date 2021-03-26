package com.example.Warehouse.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "warehouse")
public class Warehouse {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int warehouseId;
    @Column
    String WarehouseName;
    @OneToMany(mappedBy = "warehouse")
    private Set<Product> productsSet;
    @OneToMany(mappedBy = "warehouse")
    private Set<Cart> cartsSet;

}
