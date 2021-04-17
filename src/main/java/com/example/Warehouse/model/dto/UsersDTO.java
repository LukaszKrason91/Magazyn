package com.example.Warehouse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {
    private int userId;
    private String userFirstName;
    private String userLastName;
    private String userPassword;
    private String login;

    public UsersDTO(String userName, String userLastName, String userPassword, String login) {
        this.userFirstName = userName;
        this.userLastName = userLastName;
        this.userPassword = userPassword;
        this.login=login;
    }
}
