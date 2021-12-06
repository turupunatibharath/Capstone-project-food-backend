package com.example.backendfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendfood.entity.Crud;
import com.example.backendfood.repository.CrudRepository;

@Service
public class CrudService {

	@Autowired
	private CrudRepository repository;
	
	public Crud saveitem(Crud crud) {
		return repository.save(crud);
	}
	
	public List<Crud> saveitems(List<Crud> crud){
		return repository.saveAll(crud);
	}
	
	public List<Crud> getitems(){
		return repository.findAll();
	}
	
	public Crud getitemById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public Crud getitemByTitle(String name){
		return repository.findByTitle(name);
	}
	
	public String deleteitem(int id) {
		repository.deleteById(id);
		return "item removed succesfully !!"+id;
	}
	
	public Crud updateitem(Crud crud) {
		Crud existingitem =repository.findById(crud.getId()).orElse(null);
		existingitem.setTitle(crud.getTitle());
		existingitem.setPrice(crud.getPrice());
		existingitem.setCategory(crud.getCategory());
		return repository.save(existingitem);

	}
}
