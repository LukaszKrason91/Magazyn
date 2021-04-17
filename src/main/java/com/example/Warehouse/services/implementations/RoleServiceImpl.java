package com.example.Warehouse.services.implementations;

import com.example.Warehouse.exceptions.RoleNotFoundException;
import com.example.Warehouse.model1.Role;
import com.example.Warehouse.model1.dto.RoleDTO;
import com.example.Warehouse.repositories.RoleRepository;
import com.example.Warehouse.services.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public List<RoleDTO> findAllRole() {
        return roleRepository.findAll().stream()
                .map(role -> modelMapper.map(role,RoleDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public RoleDTO createRole(RoleDTO roleDTO) {
        roleRepository.save(modelMapper.map(roleDTO,Role.class));
        return roleDTO;
    }


    @Override
    public void deleteRoleById(int roleId) {
        roleRepository.deleteById(roleId);

    }

    @Override
    public Role getRoleEntity(int roleId) {
        return roleRepository.findById(roleId).orElseThrow(RoleNotFoundException::new);
    }
}
