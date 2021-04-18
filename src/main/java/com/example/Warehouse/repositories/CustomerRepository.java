package com.example.Warehouse.repositories;

import com.example.Warehouse.model.Customer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Qualifier("customer")
@Repository
@EnableJpaRepositories
public interface CustomerRepository extends JpaRepository<Customer, Integer> {



    Optional<Customer> findCustomerByCustomerName(String customerName);
    Optional<Customer> findCustomerByCustomerEmail(String customerEmail);

}
