package com.example.backendfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendfood.entity.Crud;
import com.example.backendfood.entity.Product;
import com.example.backendfood.repository.ProductRepository;


import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
 

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }
    public Product getitemById(int id) {
    	return repository.findById(id).orElse(null);
    }
    
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }
     public Product updateproduct(Product product) {
    	 Product existingproduct = repository.findById(product.getId()).orElse(null);
    	 existingproduct.setTitle(product.getTitle());
    	 existingproduct.setPrice(product.getPrice());
    	 existingproduct.setCategory(product.getCategory());
    	 return repository.save(existingproduct);
     }

	

   
}
