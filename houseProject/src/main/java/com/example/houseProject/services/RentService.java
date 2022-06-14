package com.example.houseProject.services;
import java.util.List;

import com.example.houseProject.models.Rent;

import com.example.houseProject.repository.RentRepository;

import org.springframework.stereotype.Service;

@Service
public class RentService {
    private final RentRepository rentRepository;

    public RentService(RentRepository rentRepository){
        this.rentRepository = rentRepository;
    }

    public void add(Rent rent){
        rentRepository.save(rent);

}
    public List<Rent> getList(){
        return rentRepository.findAll();
    }
}