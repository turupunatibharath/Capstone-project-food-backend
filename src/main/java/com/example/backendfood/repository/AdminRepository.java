package com.example.backendfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendfood.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin ,Integer>{
	
}
