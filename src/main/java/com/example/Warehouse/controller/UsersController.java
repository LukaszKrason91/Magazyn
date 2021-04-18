package com.example.Warehouse.controller;

import com.example.Warehouse.model.dto.UsersDTO;
import com.example.Warehouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UsersDTO> findAllUsers(){
        return userService.findAllUsers();
    }

    @PutMapping
    public UsersDTO create(@Valid @RequestBody UsersDTO usersDTO){
        return userService.create(usersDTO);
    }

    @PutMapping("/{userId}")
    public UsersDTO update(@PathVariable int userId, @RequestBody UsersDTO usersDTO){
        return userService.update(userId, usersDTO);
    }

    @GetMapping("/{userId}")
    public UsersDTO findById(@PathVariable int userId){
        return userService.findById(userId);
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable int userId){
        userService.delete(userId);
    }

}
