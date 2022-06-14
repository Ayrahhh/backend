package com.example.houseProject.repository;

import com.example.houseProject.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>  {
    
}
