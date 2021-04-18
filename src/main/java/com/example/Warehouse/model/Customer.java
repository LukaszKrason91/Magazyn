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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    @Column
    @NotNull
    private String customerName;
    @Column
    @NotNull
    private String customerAddress;
    @Column
    @NotNull
    private String customerEmail;
    @OneToMany(mappedBy = "customer")
    private Set<Cart> cartSet;

}