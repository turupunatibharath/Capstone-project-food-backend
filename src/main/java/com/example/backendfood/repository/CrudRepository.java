package com.example.backendfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendfood.entity.Crud;

public interface CrudRepository extends JpaRepository<Crud , Integer>{

	Crud findByTitle(String name);
}
