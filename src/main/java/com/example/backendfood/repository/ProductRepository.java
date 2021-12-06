package com.example.backendfood.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendfood.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByTitle(String name);
}

