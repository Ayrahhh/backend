package com.example.houseProject.controllar;

import java.util.List;

import com.example.houseProject.models.User;
import com.example.houseProject.services.UserService;

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
@RequestMapping(path = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("post")
    public void add(@RequestBody User user) {
        userService.add(user);
    }

    @GetMapping("get")
    public List<User> getAll() {
        return userService.getList();
    }

    @GetMapping("/{id}")
    public User findUseById(@PathVariable(value = "id") long id) {
        return null;

    }
//
    @GetMapping("login/email/{email}/pass/{pass}")
    public User login(@PathVariable("email") String email,@PathVariable("pass") String pass){
        return userService.login(email, pass);
    }
}
