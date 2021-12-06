package com.example.backendfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendfood.entity.User;
import com.example.backendfood.repository.RegisterRepository;

@Service
public class RegisterService {
	
	@Autowired
	private RegisterRepository registerrepository;
	
	
	public User saveUser(User user) {
		return registerrepository.save(user);
	}

	public List<User> saveUsers(List<User> users){
		return registerrepository.saveAll(users);
	}
	
	public List<User> getUsers(){
		return registerrepository.findAll();
	}
	
	
}


