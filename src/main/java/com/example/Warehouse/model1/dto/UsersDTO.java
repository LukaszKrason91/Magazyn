package com.example.Warehouse.model1.dto;

import com.example.Warehouse.model1.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {
    private int userId;
    private String userFirstName;
    private String userLastName;
    private String userPassword;
    private String login;
    private Set<Role> roleSet;

    public UsersDTO(String userName, String userLastName, String userPassword, String login) {
        this.userFirstName = userName;
        this.userLastName = userLastName;
        this.userPassword = userPassword;
        this.login=login;
    }

    public UsersDTO(String userFirstName, String userLastName, String userPassword, String login, Set<Role> roleSet) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userPassword = userPassword;
        this.login = login;
        this.roleSet = roleSet;
    }

    public UsersDTO(String login, String userPassword, Set<GrantedAuthority> grantedAuthorities) {
    }
}
