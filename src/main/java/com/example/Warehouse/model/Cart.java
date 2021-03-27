package com.example.Warehouse.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

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
    private int cartId;
    @Column
    private String cartName;
    @Column
    @NotNull
    private int orderedQuantity;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customer;
    @OneToMany(mappedBy = "carts")
    private Set<Returns> aReturnsSet;
    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;
    @ManyToMany
    @JoinTable(
            name = "cart_element",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> productsInCart;
}
