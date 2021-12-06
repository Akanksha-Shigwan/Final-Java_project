package com.example.onlinetoyshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinetoyshop.entity.CheckoutData;
import com.example.onlinetoyshop.entity.UserData;



public interface UserRepository extends JpaRepository<UserData, Integer>{

}
