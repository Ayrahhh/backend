package com.example.houseProject.controllar;

import java.util.List;

import com.example.houseProject.models.House;
import com.example.houseProject.services.HouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(path = "house")
public class HouseController{
    @Autowired
    private HouseService houseService;

    @PostMapping("post")
    public void post(@RequestBody House house){
        houseService.add(house);
    }
    @GetMapping({"/id"})
    public House findUserById(@PathVariable(value = "id")long id){
        return null;
    }
    @GetMapping("get")
    public List<House> getAll(){
        return houseService.getList();

    }

}
