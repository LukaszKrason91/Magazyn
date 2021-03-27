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
@Table(name = "users")
public class Users {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column
    @NotNull
    private String userName;
    @Column
    @NotNull
    private String userPassword;
    @ManyToOne
    @JoinColumn (name ="customer_id")
    private  Customers customerReturns;

    @OneToMany(mappedBy = "users")
    private Set<Role> rolesSet;
    @ManyToMany
    @JoinTable(name = "customers_returns",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "return_id"))
    private Set<Returns> returnsSet;

}
