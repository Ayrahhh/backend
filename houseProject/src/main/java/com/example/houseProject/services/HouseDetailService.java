package com.example.houseProject.services;

import java.util.List;

import com.example.houseProject.dto.HouseDetailsDto;
import com.example.houseProject.models.HouseDetail;
import com.example.houseProject.repository.HouseDetailRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class HouseDetailService {
    private final HouseDetailRepository housedetailRepository;
    private final ModelMapper mapper;
   

    public void add(HouseDetailsDto housedetailsDetailsDto){
        HouseDetail housedetail = mapper.map(housedetailsDetailsDto, HouseDetail.class);
        housedetailRepository.save(housedetail);
    }
    public List<HouseDetail> getList(){
        return housedetailRepository.findAll();
    }
}

