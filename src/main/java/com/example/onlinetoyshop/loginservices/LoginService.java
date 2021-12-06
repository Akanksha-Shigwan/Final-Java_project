package com.example.onlinetoyshop.loginservices;

import org.springframework.stereotype.Service;


import com.example.onlinetoyshop.logindomain.Login;
import com.example.onlinetoyshop.loginrepository.loginRepository;


import org.springframework.beans.factory.annotation.Autowired;

 

 
 
 
@Service
public class LoginService {
@Autowired
private loginRepository repo;
  
  public Login login(String username, String password) {
  Login user = repo.findByEmailAndPassword(username, password);
  return user;
 
}
}
