package com.example.backendfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendfood.entity.Checkout;

public interface CheckoutRepository extends JpaRepository<Checkout , Integer>{

}
