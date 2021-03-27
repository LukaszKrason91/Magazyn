package com.example.Warehouse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {
    private int roleId;
    private String roleName;

    public RoleDto(String roleName) {
        this.roleName = roleName;
    }
}
