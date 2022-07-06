
package com.example.houseProject.services;

import java.util.List;

import com.example.houseProject.models.Customer;
import com.example.houseProject.models.User;
import com.example.houseProject.repository.CustomerRepository;
import com.example.houseProject.repository.UserRepository;

import org.springframework.stereotype.Service;



@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final UserRepository userRepository;
    
    public CustomerService(CustomerRepository customerRepository,UserRepository userRepository) {
        this.customerRepository = customerRepository;
        this.userRepository = userRepository;
    }

    public void add(Customer customer){
        //System.out.println(customer);
        User user = new User();
        user.setEmail(customer.getEmail());
        user.setPassword(customer.getPassword());
        user.setUsername(customer.getEmail());
        user.setRole("customer");
        userRepository.save(user);
        customerRepository.save(customer);
    }

    public List<Customer> getList(){
        return customerRepository.findAll();
    }

    public Customer getByEmail(String email){
        return customerRepository.getByEmail(email);
    }

}

