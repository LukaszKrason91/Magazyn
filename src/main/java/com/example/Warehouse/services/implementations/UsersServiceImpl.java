package com.example.Warehouse.services.implementations;

import com.example.Warehouse.model1.Role;
import com.example.Warehouse.model1.Users;
import com.example.Warehouse.model1.dto.UsersDTO;
import com.example.Warehouse.repositories.RoleRepository;
import com.example.Warehouse.repositories.UsersRepository;
import com.example.Warehouse.services.UsersService;
import com.example.Warehouse.exceptions.UserNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<UsersDTO> findAllUsers() {
        return usersRepository.findAll().stream()
                .map(users -> modelMapper.map(users, UsersDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UsersDTO create(UsersDTO usersDTO) {
       usersDTO.setUserPassword(passwordEncoder.encode(usersDTO.getUserPassword()));
       Set<Role> roleSet=new HashSet<>();
       roleSet.add(roleRepository.findByName("admin"));
       usersDTO.setRoleSet(roleSet);
       usersRepository.save((Users.class).cast(usersDTO));

        return usersDTO;
    }

    @Override
    public UsersDTO update(int userId, UsersDTO usersDTO) {
        Users users = getUserEntity(userId);
        if (usersDTO.getUserFirstName() != null) {
            users.setUserFirstName(usersDTO.getUserFirstName());
        }
        if (usersDTO.getUserLastName() != null) {
            users.setUserLastName(usersDTO.getUserLastName());
        }
        if (usersDTO.getLogin() != null) {
            users.setLogin(usersDTO.getLogin());
        }

        return modelMapper.map(usersRepository.save(users), UsersDTO.class);
    }

    @Override
    public void delete(int userId) {
        usersRepository.deleteById(userId);

    }

    @Override
    public UsersDTO findById(int userId) {
        return modelMapper.map(usersRepository.findById(userId)
                .orElseThrow(UserNotFoundException::new), UsersDTO.class);
    }

    @Override
    public Users getUserEntity(int userId) {
        return usersRepository.findById(userId).orElseThrow(UserNotFoundException::new);
    }

    @Override
    public UsersDTO findByLogin(String login) {
        return usersRepository.findByLogin(login).map(users -> modelMapper.map(users,UsersDTO.class)).orElseThrow();
    }

    @Override
    public UsersDTO findByUserLastName(String userLastName) {
        return usersRepository.findByUserLastName(userLastName).map(users -> modelMapper.map(users,UsersDTO.class)).orElseThrow();
    }
}
