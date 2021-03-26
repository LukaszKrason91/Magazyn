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
@Table(name = "customers")
public class Customers {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;
    @Column
    String customerName;
    @OneToMany(mappedBy = "customer")
    private Set<Cart> cartSet;
    @OneToMany(mappedBy = "customerReturns")
    private Set<Returns> returnsSet;


}
