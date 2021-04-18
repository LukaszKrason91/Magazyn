package com.example.Warehouse.repositories;

import com.example.Warehouse.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

    Optional<Users>findUserByFirstName(String userFirstName);
    Optional<Users>findUserByLastName(String userLasttName);
}
