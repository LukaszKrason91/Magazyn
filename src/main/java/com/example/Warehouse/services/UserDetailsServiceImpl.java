package com.example.Warehouse.services;

import com.example.Warehouse.model1.Role;
import com.example.Warehouse.model1.Users;
import com.example.Warehouse.model1.dto.UsersDTO;
import com.example.Warehouse.repositories.UsersRepository;
import com.example.Warehouse.services.implementations.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
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
    UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        UsersDTO usersDTO= usersRepository.findByLogin(login);
        Set<GrantedAuthority> grantedAuthorities=new HashSet<>();
        if (usersDTO !=null){
            for (Role role:usersDTO.getRoleSet()){
                grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
            }

        }else {
            throw  new UsernameNotFoundException(login + " is not found");
        }
        return (UserDetails) new UsersDTO(usersDTO.getLogin(),usersDTO.getUserPassword(),grantedAuthorities);
    }

}
