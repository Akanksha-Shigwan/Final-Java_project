package com.example.onlinetoyshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.onlinetoyshop.entity.CheckoutData;

public interface CheckRepository extends JpaRepository<CheckoutData, Integer>{

}
