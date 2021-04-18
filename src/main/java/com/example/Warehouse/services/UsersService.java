package com.example.Warehouse.services;

import com.example.Warehouse.model1.Users;
import com.example.Warehouse.model1.dto.UsersDTO;

import java.util.List;

public interface UsersService {
    List<UsersDTO> findAllUsers();

    UsersDTO create(UsersDTO usersDTO);

    UsersDTO update(int userId, UsersDTO usersDTO);

    void delete(int userId);

    UsersDTO findById(int userId);

    Users getUserEntity(int userId);

    UsersDTO findByLogin (String login);

    UsersDTO findByUserLastName(String userLastName);


}

