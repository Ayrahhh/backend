package com.example.houseProject.repository;

import com.example.houseProject.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long>  {
    //
    @Query(value="select * from user where email=?1 and password=?2",nativeQuery = true)
    public User login(String email,String password);
}
