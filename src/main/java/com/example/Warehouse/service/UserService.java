package com.example.Warehouse.service;

import com.example.Warehouse.model.Users;
import com.example.Warehouse.model.dto.UsersDTO;

import java.util.List;

public interface UserService {
    List<UsersDTO> findAllUsers();

    UsersDTO create(UsersDTO usersDTO);

    UsersDTO update(int userId, UsersDTO usersDTO);

    void delete(int userId);

    UsersDTO findById(int userId);

    Users getUserEntity(int userId);

    UsersDTO findUserByFirstName(String userFirstName);

    UsersDTO findUserByLasrName(String userLastName);
}
