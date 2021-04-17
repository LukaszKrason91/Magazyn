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
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manufacturerId;
    @Column
    @NotNull
    private String manufacturerName;
    @OneToMany(mappedBy = "manufacturer")
    private Set<Product> productSet;
}
