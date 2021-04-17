package com.example.Warehouse.repositories;

import com.example.Warehouse.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
