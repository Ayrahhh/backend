
package com.example.houseProject.services;

import java.util.List;

import com.example.houseProject.models.Customer;
import com.example.houseProject.repository.CustomerRepository;

import org.springframework.stereotype.Service;



@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void add(Customer customer){
        //System.out.println(customer);
        customerRepository.save(customer);
    }

    public List<Customer> getList(){
        return customerRepository.findAll();
    }

}

