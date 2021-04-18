package com.example.Warehouse.controller;

import com.example.Warehouse.model.dto.CustomerDTO;
import com.example.Warehouse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public List<CustomerDTO> getAllCustomer(){
        return customerService.findAllCustomers();
    }

    @GetMapping("/{customerId}")
    public CustomerDTO findCustomerById(@PathVariable int customerId){
        return customerService.findCustomerById(customerId);
    }
    @GetMapping("/{customerName}")
    public CustomerDTO findCustomerByName(@PathVariable String customerName){
        return customerService.findCustomerByName(customerName);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO create(@Valid @RequestBody CustomerDTO customerDTO){
        return customerService.createCustomer(customerDTO);
    }

    @PutMapping("/{customerId}")
    @ResponseStatus
    public CustomerDTO update(@PathVariable int customerId, @RequestBody CustomerDTO customerDTO){
        return customerService.update(customerId, customerDTO);
    }

    @DeleteMapping("/{customerId}")
    public void delete(@PathVariable int customerId){
        customerService.deleteCustomer(customerId);
    }
}
