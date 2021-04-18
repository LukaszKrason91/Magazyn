package com.example.Warehouse.repositories;

import com.example.Warehouse.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findRoleByName(String roleName);
}
