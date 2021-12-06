package com.example.backendfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendfood.entity.Admin;
import com.example.backendfood.entity.Checkout;
import com.example.backendfood.repository.AdminRepository;

@Service
public class AdminService {

	
	@Autowired
	private AdminRepository repository;
	
	public Admin saveAdmin(Admin admin) {
		return repository.save(admin);
	}
	
	public List<Admin> getAdmin() {
		return repository.findAll();
	}
}
