package com.example.houseProject.controllar;

import java.util.List;

import com.example.houseProject.models.Rent;
import com.example.houseProject.services.RentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="rent")
public class RentController{
    @Autowired
    private RentService rentService;
    
@PostMapping("post")
    public void post(@RequestBody Rent rent){
        rentService.add(rent);
    }
    @CrossOrigin
@GetMapping("get")
    public List<Rent>getAll(){
        return rentService.getList();
    }

    @GetMapping("/{id}")
    public Rent findUserById(@PathVariable(value = "id") long id ){
        return null;
    }
}