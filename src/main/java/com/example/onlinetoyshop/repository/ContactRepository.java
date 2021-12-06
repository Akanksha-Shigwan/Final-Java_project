package com.example.onlinetoyshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinetoyshop.entity.ContactData;


public interface ContactRepository extends JpaRepository<ContactData, Integer>{

}
