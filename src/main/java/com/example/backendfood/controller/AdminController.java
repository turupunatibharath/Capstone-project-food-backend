package com.example.backendfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendfood.entity.Admin;
import com.example.backendfood.entity.Login;
import com.example.backendfood.service.AdminService;

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("admin")
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	
	  @PostMapping("/addadmin")
	    public Admin addAdmin(@RequestBody Admin admin) {
	    	return adminservice.saveAdmin(admin);
	    }
	    
	    @GetMapping("/getadmin")
	    public List<Admin> findAllAdmin(){
	    	return adminservice.getAdmin();
	    }
}
