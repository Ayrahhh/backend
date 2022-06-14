package com.example.houseProject.controllar;

import java.util.List;

import com.example.houseProject.dto.HouseDetailsDto;
import com.example.houseProject.models.HouseDetail;
import com.example.houseProject.services.HouseDetailService;

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
@RequestMapping(path = "housedetail")
public class HouseDetailController {
    @Autowired
    private HouseDetailService housedetailService;

    @PostMapping("post")
    public void post(@RequestBody HouseDetailsDto housedetailsDetailsDto){
        housedetailService.add(housedetailsDetailsDto);
    }
    

    @GetMapping({"/id"})
    public HouseDetail findUserById(@PathVariable(value = "id")long id){
        return null;
    }
    
@GetMapping("get")
    public List<HouseDetail> getAll(){
        return housedetailService.getList();
    }
}
