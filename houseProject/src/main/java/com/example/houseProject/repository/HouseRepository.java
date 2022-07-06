package com.example.houseProject.repository;

import java.util.Optional;

import com.example.houseProject.models.House;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HouseRepository extends JpaRepository<House,Long>{
   
    @Query(value = "select * from house where house.house_id = ? ",nativeQuery = true)
    public Optional<House> updateRented(long house_id);
}