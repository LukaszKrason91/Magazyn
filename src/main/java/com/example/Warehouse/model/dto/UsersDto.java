package com.example.Warehouse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
    private int userId;
    private String userName;
    private String userPassword;

    public UsersDto(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }
}
