package com.example.houseProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.houseProject.models.HouseDetail;
public  interface HouseDetailRepository extends JpaRepository<HouseDetail,Long>{

    
}
