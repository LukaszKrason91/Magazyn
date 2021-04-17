package com.example.Warehouse.service.implementation;

import com.example.Warehouse.model.Customer;
import com.example.Warehouse.model.dto.CustomerDTO;
import com.example.Warehouse.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<CustomerDTO> findAllCustomers() {
        return null;
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public void deleteCustomer(int customerId) {

    }

    @Override
    public CustomerDTO findCustomerById(int customerId) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByName(String customerName) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByEmail(String customerEmail) {
        return null;
    }

    @Override
    public Customer getCustomerEntity(int customerId) {
        return null;
    }

    @Override
    public CustomerDTO update(int customerId, CustomerDTO customerDTO) {
        return null;
    }
}
