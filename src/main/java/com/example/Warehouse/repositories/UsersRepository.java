package com.example.Warehouse.repositories;

import com.example.Warehouse.model1.Users;
import com.example.Warehouse.model1.dto.UsersDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

    UsersDTO findByLogin(String login);

    UsersDTO findByUserLastName(String userLastName);


}

