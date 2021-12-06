package com.example.backendfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendfood.entity.Crud;
import com.example.backendfood.service.CrudService;

@RestController
@RequestMapping("/crud")
public class CrudController {

	@Autowired
	private CrudService crudservice;
	
	@PostMapping("/additem")
	public Crud additem(@RequestBody Crud crud) {
		return crudservice.saveitem(crud);
	}
	
	@PostMapping("/additems")
	public List<Crud> additems(@RequestBody List<Crud> crud) {
		return crudservice.saveitems(crud);
	}
	
	@GetMapping("/items")
	public List<Crud> findAllItems(){
		return crudservice.getitems();
	}
	
	@GetMapping("/item/{id}")
	public Crud finditembyid(@PathVariable int id) {
		return crudservice.getitemById(id);
	}
	
	@GetMapping("/item/{title}")
	public Crud finditembytitle(@PathVariable String name) {
		return crudservice.getitemByTitle(name);
	}
	
	@PutMapping("/update")
	public Crud updateItem(@RequestBody Crud crud) {
		return crudservice.updateitem(crud);
	}
	
	@DeleteMapping("/deleteitem/{id}")
	@CrossOrigin("http://localhost:4200")
	public String deleteitem(@PathVariable int id) {
		return crudservice.deleteitem(id);
	}
}
