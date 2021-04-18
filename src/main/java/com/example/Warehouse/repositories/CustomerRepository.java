package com.example.Warehouse.repositories;

import com.example.Warehouse.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


    Optional<Customer> findByCustomerName(String customerName);
    Optional<Customer> findByCustomerEmail(String customerEmail);

}
