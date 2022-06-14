package com.example.houseProject.services;
import java.util.List;

import com.example.houseProject.models.User;

import com.example.houseProject.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository ;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void add(User user){
        userRepository.save(user);

}
    public List<User> getList(){
        return userRepository.findAll();
    }
}