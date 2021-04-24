package com.example.Warehouse.services;

import com.example.Warehouse.model1.Users;
import com.example.Warehouse.model1.dto.UsersDTO;
import com.example.Warehouse.repositories.UsersRepository;
import com.example.Warehouse.services.implementations.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsersServiceImpl usersService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        UsersDTO usersDTO= usersService.findByLogin(login);
        Set<GrantedAuthority> grantedAuthorities=new HashSet<>();
        return (UserDetails) new UsersDTO(usersDTO.getLogin(),usersDTO.getUserPassword(),grantedAuthorities);
    }

}
