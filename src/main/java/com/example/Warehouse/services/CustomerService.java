package com.example.Warehouse.services;

import com.example.Warehouse.model1.Cart;
import com.example.Warehouse.model1.Customer;
import com.example.Warehouse.model1.dto.CustomerDTO;

import java.util.List;
import java.util.Set;

public interface CustomerService {
    List<CustomerDTO> findAllCustomers();

    CustomerDTO createCustomer(CustomerDTO customerDTO);

    void deleteCustomer(int customerId);

    CustomerDTO findCustomerById(int customerId);

    CustomerDTO findCustomerByName(String customerName);

    CustomerDTO findCustomerByEmail(String customerEmail);

    Customer getCustomerEntity(int customerId);

    CustomerDTO update(int customerId, CustomerDTO customerDTO);
}
