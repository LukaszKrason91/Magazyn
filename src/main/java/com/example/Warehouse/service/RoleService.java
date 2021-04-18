package com.example.Warehouse.service;

import com.example.Warehouse.model.Role;
import com.example.Warehouse.model.dto.RoleDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RoleService {

    List<RoleDTO> findAllRole();

    RoleDTO createRole(RoleDTO roleDTO);

    void deleteRoleById(int roleId);

    Role getRoleEntity(int roleId);

    RoleDTO findRoleByName(String roleName);
}
