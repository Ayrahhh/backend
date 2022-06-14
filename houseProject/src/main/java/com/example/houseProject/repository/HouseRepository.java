package com.example.houseProject.repository;

import com.example.houseProject.models.House;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House,Long>{
    
}