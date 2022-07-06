package com.example.houseProject.services;
import com.example.houseProject.dto.HouseDto;
import com.example.houseProject.models.House;
import com.example.houseProject.repository.HouseRepository;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

//mapper inachukua field zenye same datatypes
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class HouseService{
    private final HouseRepository  houseRepository;
    private final ModelMapper mapper;
   
    public void add(HouseDto houseDto) throws IOException{
        
        //dto sio table table ni house , dto inchukua data kutoka kwa user au controller end point ambayo user ana interact nayo kisha anamletea house
        House house = mapper.map(houseDto, House.class);
        house.setImage(Base64.getEncoder().encodeToString(houseDto.getImage().getBytes()));
        System.out.println(house.getPrice_per_month());
        houseRepository.save(house);
    }
    public List<House> getList(){
        return houseRepository.findAll();
    }

    public House getbyId(long id){
        return houseRepository.findById(id).get();
    }

   public void delete(long id){
        houseRepository.deleteById(id);
   }

   public void update(HouseDto houseDto) throws IOException{
    House house = mapper.map(houseDto, House.class);
    //
    house.setImage(Base64.getEncoder().encodeToString(houseDto.getImage().getBytes()));
    System.out.print(houseDto.getPrice_per_month());
    houseRepository.save(house); 
   }

}