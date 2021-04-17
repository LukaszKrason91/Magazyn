package com.example.Warehouse.repositories;

import com.example.Warehouse.model1.Users;
import com.example.Warehouse.model1.dto.UsersDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
