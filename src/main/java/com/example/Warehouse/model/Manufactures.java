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
@Table(name = "manufactures")
public class Manufactures {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manufactureId;
    @Column
    @NotNull
    private String manufacturerName;
    @OneToMany(mappedBy = "manufactures")
    private Set<Product> productsSetOne;

}
