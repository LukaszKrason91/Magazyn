package com.example.Warehouse.service.implementation;

import com.example.Warehouse.model.Users;
import com.example.Warehouse.model.dto.UsersDTO;
import com.example.Warehouse.repositories.UsersRepository;
import com.example.Warehouse.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<UsersDTO> findAllUsers() {
        return usersRepository.findAll().stream()
                .map(users -> modelMapper.map(users, UsersDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UsersDTO create(UsersDTO usersDTO) {
        usersRepository.save(modelMapper.map(usersDTO, Users.class));
        return usersDTO;
    }

    @Override
    public UsersDTO update(int userId, UsersDTO usersDTO) {
        return null;
    }

    @Override
    public void delete(int userId) {
        usersRepository.deleteById(userId);
    }

    @Override
    public UsersDTO findById(int userId) {
        return null;
    }

    @Override
    public Users getUserEntity(int userId) {
        return null;
    }
}
