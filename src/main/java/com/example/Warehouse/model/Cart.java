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
@Table(name = "cart")
public class Cart {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cartId;
    @Column
    String cartName;
    @Column
    int orderedQuantity;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customers customer;
    @OneToMany(mappedBy = "carts")
    private Set<Returns> aReturnsSet;
    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    Warehouse warehouse;
    @ManyToMany
    @JoinTable(
            name = "cart_element",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    Set<Product> productsInCart;
}
