package com.example.backendfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendfood.entity.Login;
import com.example.backendfood.entity.User;
import com.example.backendfood.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginrepository;
	
	public Login saveLogin(Login login) {
		return loginrepository.save(login);
	}
	
	public List<Login> getLogin(){
		return loginrepository.findAll();
	}

}
