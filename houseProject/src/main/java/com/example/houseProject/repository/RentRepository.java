package com.example.houseProject.repository;

import com.example.houseProject.dto.RentDetails;
import com.example.houseProject.models.Rent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RentRepository extends JpaRepository<Rent,Long>{
    @Query(value = "SELECT category, house_no, house_owner, image, location, price_per_month,firstname, lastname, start_date,end_date FROM house,customer,rent WHERE house.house_id=rent.house_id "+
    "and customer.id=rent.customer_id and customer.email=?",nativeQuery = true)
    public RentDetails getRentDetails(String email);
}