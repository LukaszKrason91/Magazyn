package com.example.Warehouse.model1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Return {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int returnId;
    @Column
    private int returnQuantity;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
}
