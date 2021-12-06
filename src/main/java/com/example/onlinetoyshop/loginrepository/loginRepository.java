package com.example.onlinetoyshop.loginrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinetoyshop.logindomain.Login;

public interface loginRepository extends JpaRepository<Login, Long>{
	Login findByEmailAndPassword(String email, String password);
}
