package com.example.Warehouse.model1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO {
    private int roleId;
    private String roleName;

    public RoleDTO(String roleName) {
        this.roleName = roleName;
    }
}
