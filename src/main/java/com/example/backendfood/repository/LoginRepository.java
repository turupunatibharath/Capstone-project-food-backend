package com.example.backendfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendfood.entity.Login;

public interface LoginRepository extends JpaRepository<Login , Integer>{

}
