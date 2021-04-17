package com.example.Warehouse.service.implementation;

import com.example.Warehouse.model.Customer;
import com.example.Warehouse.model.dto.CustomerDTO;
import com.example.Warehouse.repositories.CustomerRepository;
import com.example.Warehouse.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CustomerDTO> findAllCustomers() {
        return customerRepository.findAll().stream()
                .map(customer -> modelMapper.map(customer, CustomerDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        customerRepository.save(modelMapper.map(customerDTO, Customer.class));
        return customerDTO;
    }

    @Override
    public void deleteCustomer(int customerId) {
        customerRepository.deleteById(customerId);
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
