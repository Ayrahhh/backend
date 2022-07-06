package com.example.houseProject.dto;

import java.time.LocalDate;

public interface RentDetails {
    String getCategory();
    int getHouse_no(); 
    String getHouse_owner();
    String getImage();
    String getLocation(); 
    double getPrice_per_month();
    String getFirstname(); 
    String getLastname(); 
    LocalDate getStart_date();
    LocalDate getEnd_date();
}
