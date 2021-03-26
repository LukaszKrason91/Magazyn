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
@Table(name = "returns")
public class Returns {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int returnId;
    @Column
    int returnQuantity;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customers customerReturns;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    Cart carts;


    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;


}
