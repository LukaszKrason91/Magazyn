package com.example.Warehouse.controller;

import com.example.Warehouse.model1.dto.UsersDTO;
import com.example.Warehouse.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    @ResponseStatus
    public List<UsersDTO> getAllUsers() {
        return usersService.findAllUsers();
    }

    @GetMapping("/{userId}")
    public UsersDTO findById(@PathVariable int userId) {
        return usersService.findById(userId);
    }

    @GetMapping ("/{login}")
    public UsersDTO findByLogin(@PathVariable String login){return usersService.findByLogin(login);}

    @GetMapping("/{userLastName}")
    public UsersDTO findByUserLastName(@PathVariable String userLastName){return usersService.findByUserLastName(userLastName);}

    @PutMapping
    public UsersDTO create(@Valid @RequestBody UsersDTO usersDTO) {
        return usersService.create(usersDTO);
    }

    @PutMapping("/{userId}")
    public UsersDTO update(@PathVariable int userId, @RequestBody UsersDTO usersDTO) {
        return usersService.update(userId, usersDTO);
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable int userId) {
        usersService.delete(userId);
    }


}