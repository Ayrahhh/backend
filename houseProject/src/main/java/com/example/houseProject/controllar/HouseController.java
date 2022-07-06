package com.example.houseProject.controllar;

import java.io.IOException;
import java.util.List;

import com.example.houseProject.dto.HouseDto;
import com.example.houseProject.models.House;
import com.example.houseProject.services.HouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@CrossOrigin
@RestController
@RequestMapping(path = "house")
public class HouseController{
    @Autowired
    private HouseService houseService;
//mapping inakuwezesha kuonekana kwenye browser
    @PostMapping("post")
    public void post(@ModelAttribute HouseDto houseDto) throws IOException{
        houseService.add(houseDto);
    }
    @GetMapping({"/id"})
    public House findUserById(@PathVariable(value = "id")long id){
        return null;
    }
    @GetMapping("get")
    public List<House> getAll(){
        return houseService.getList();

    }
    @GetMapping("get/{id}")
    public House getbyid(@PathVariable(value = "id")long id){
        return houseService.getbyId(id);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable(value ="id")long id){
        houseService.delete(id);
    }
    @PutMapping("update")
    public void update(@ModelAttribute HouseDto houseDto) throws IOException {
        houseService.update(houseDto);
    }
}
