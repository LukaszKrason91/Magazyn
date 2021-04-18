package com.example.Warehouse.service;

import com.example.Warehouse.model.Customer;
import com.example.Warehouse.model.dto.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
