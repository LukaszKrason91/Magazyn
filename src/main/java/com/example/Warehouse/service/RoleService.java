package com.example.Warehouse.service;

import com.example.Warehouse.model.Role;
import com.example.Warehouse.model.dto.RoleDTO;

import java.util.List;

public interface RoleService {

    List<RoleDTO> findAllRole();

    RoleDTO createRole(RoleDTO roleDTO);

    void deleteRoleById(int roleId);

    Role getRoleEntity(int roleId);

    RoleDTO findRoleByName(String roleName);
}
