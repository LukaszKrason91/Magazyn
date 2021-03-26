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
@Table(name = "users")
public class Users {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userId;
    @Column
    String userName;
    @Column
    String userPassword;
    @OneToMany(mappedBy = "users")
    private Set<Role> rolesSet;

}
