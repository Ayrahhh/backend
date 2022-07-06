package com.example.houseProject.services;

import java.util.List;
import java.util.Optional;

import com.example.houseProject.dto.RentDetails;
import com.example.houseProject.models.House;
import com.example.houseProject.models.Rent;
import com.example.houseProject.repository.HouseRepository;
import com.example.houseProject.repository.RentRepository;

import org.springframework.stereotype.Service;

@Service
public class RentService {
    private final RentRepository rentRepository;
    private final HouseRepository houseRepository;

    public RentService(RentRepository rentRepository, HouseRepository houseRepository) {
        this.rentRepository = rentRepository;
        this.houseRepository = houseRepository;
    }

    public void add(Rent rent) {
        Optional<House> optn = houseRepository.updateRented(rent.getHouse_id());
        if (optn.isPresent()) {
            House house = optn.get();
            house.setRented(true);
            houseRepository.save(house);
            rentRepository.save(rent);
        }

    }

    public List<Rent> getList() {
        return rentRepository.findAll();
    }
    public RentDetails getRentDetailsByEmail(String email){
        return rentRepository.getRentDetails(email);
    }
}