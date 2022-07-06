package com.example.houseProject.repository;

import com.example.houseProject.models.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
    @Query(value = "select * from customer where email=?",nativeQuery = true)
    public Customer getByEmail(String email);
}
