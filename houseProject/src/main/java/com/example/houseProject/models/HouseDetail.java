package com.example.houseProject.models;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.Data;
@Data
@Entity
public class HouseDetail{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bed_room;
    private String setting_room;
    private String dining;
    private String toilet;
    @ManyToOne(optional = false)
    @JoinColumn(name = "house_id",referencedColumnName = "house_id")
    private House house_id;
    
    
}