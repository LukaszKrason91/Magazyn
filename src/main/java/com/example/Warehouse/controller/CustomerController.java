package com.example.Warehouse.controller;

import com.example.Warehouse.model1.dto.CustomerDTO;
import com.example.Warehouse.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<CustomerDTO> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping("/{customerId}")
    public CustomerDTO findCustomerById(@PathVariable int customerId) {
        return customerService.findCustomerById(customerId);
    }

    @PutMapping
    public CustomerDTO create(@Valid @RequestBody CustomerDTO customerDTO) {
        return customerService.createCustomer(customerDTO);
    }

    @PostMapping("/{customerId}")
    public CustomerDTO update(@PathVariable int customerId, @RequestBody CustomerDTO customerDTO) {
        return customerService.update(customerId, customerDTO);
    }

    @DeleteMapping("/{customerId}")
    public void delete(@PathVariable int customerId) {
        customerService.deleteCustomer(customerId);
    }

}
