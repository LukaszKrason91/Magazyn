package com.example.Warehouse.services;

import com.example.Warehouse.model1.Role;
import com.example.Warehouse.model1.dto.RoleDTO;

import java.util.List;

public interface RoleService {
    List<RoleDTO> findAllRole();
    RoleDTO createRole(RoleDTO roleDTO);
    void deleteRoleById(int roleId);
    Role getRoleEntity(int roleId);
}
