package com.example.houseProject.models;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;


@Data
@Entity
public class House{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long house_id;
private String house_owner;
private String location;
private int house_no;
//for the first time deta intered inakuwa false,than inakuwa true
private boolean rented;
private double price_per_month;
@Lob
private String image;
private String category;
@OneToMany
@JoinColumn(name = "house_id")
private List<Rent> rent;

}

