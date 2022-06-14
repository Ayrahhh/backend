package com.example.houseProject.services;
import com.example.houseProject.models.House;
import com.example.houseProject.repository.HouseRepository;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class HouseService{
    private final HouseRepository  houseRepository;
    private final ModelMapper mapper;
   
    public void add(House house){
        houseRepository.save(house);
    }
    public List<House> getList(){
        return houseRepository.findAll();
    }


   

}