package com.example.Warehouse.repositories;

import com.example.Warehouse.model1.Role;
import com.example.Warehouse.model1.dto.RoleDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
