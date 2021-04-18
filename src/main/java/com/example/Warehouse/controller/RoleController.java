package com.example.Warehouse.controller;

import com.example.Warehouse.model.dto.RoleDTO;
import com.example.Warehouse.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/role")
    public List<RoleDTO> findAllRole(){
        return roleService.findAllRole();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RoleDTO createRole(@Valid @RequestBody RoleDTO roleDTO){
        return roleService.createRole(roleDTO);
    }

    @DeleteMapping("/{roleId}")
    public void deleteRoleById(@PathVariable int roleId){
        roleService.deleteRoleById(roleId);
    }
}
