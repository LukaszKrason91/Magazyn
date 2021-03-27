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
@Table(name = "returns")
public class Returns {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int returnId;
    @Column
    @NotNull
    private int returnQuantity;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart carts;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;




}
