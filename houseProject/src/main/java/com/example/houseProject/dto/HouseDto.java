package com.example.houseProject.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;


@Data
public class HouseDto {
    private long house_id;
    private String house_owner;
    private String location;
    private int house_no;
    private MultipartFile image;
    private String category;
    private boolean rented;
    private double price_per_month;

    
}
