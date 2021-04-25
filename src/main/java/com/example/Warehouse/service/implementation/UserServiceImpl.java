package com.example.Warehouse.service.implementation;

import com.example.Warehouse.exceptions.UserNotFoundException;
import com.example.Warehouse.model.Users;
import com.example.Warehouse.model.dto.UsersDTO;
import com.example.Warehouse.repositories.UsersRepository;
import com.example.Warehouse.service.UserService;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
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
        Users users = getUserEntity(userId);
        if(usersDTO.getUserFirstName()!= null){
            users.setUserFirstName(usersDTO.getUserFirstName());
        }
        if(usersDTO.getUserLastName()!=null){
            users.setUserLastName(usersDTO.getUserLastName());
        }
        if (usersDTO.getLogin()!=null){
            users.setLogin(usersDTO.getLogin());
        }

        return modelMapper.map(usersRepository.save(users),UsersDTO.class);
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
    public UsersDTO findUserByFirstName(String userFirstName) {
        return usersRepository.findUserByUserFirstName(userFirstName)
                .map(users -> modelMapper.map(users, UsersDTO.class))
                .orElseThrow();
    }

    @Override
    public UsersDTO findUserByLastName(String userLastName) {
        return usersRepository.findUserByUserLastName(userLastName)
                .map(users -> modelMapper.map(users, UsersDTO.class))
                .orElseThrow();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return (UserDetails) usersRepository.findUserByLogin(s).orElseThrow(UserNotFoundException::new);
    }
}
