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
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column
    @NotNull
    private String userFirstName;
    @Column
    @NotNull
    private String userLastName;
    @Column
    @NotNull
    private String login;
    @Column
    @NotNull
    private String userPassword;
    @OneToMany (mappedBy ="users" )
    private Set<Role> roleSet;
}
