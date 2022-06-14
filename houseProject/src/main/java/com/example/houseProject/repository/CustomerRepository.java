package com.example.houseProject.repository;

import com.example.houseProject.models.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
    
}
