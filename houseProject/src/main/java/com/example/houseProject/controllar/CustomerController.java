package com.example.houseProject.controllar;

import com.example.houseProject.models.Customer;
import com.example.houseProject.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(path = "customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("post")
    public void post(@RequestBody Customer customer){
        customerService.add(customer);
    }

    @GetMapping("/{id}")
    public Customer findUserById(@PathVariable(value = "id") long id){
        return null;  
    }
    @GetMapping("get")
    public List<Customer> getAll(){
        return customerService.getList();
    }

    
}
