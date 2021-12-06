package com.example.backendfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendfood.entity.Checkout;
import com.example.backendfood.repository.CheckoutRepository;

@Service
public class CheckoutService {
	
	@Autowired
	private CheckoutRepository repository;

	public Checkout saveCheckout(Checkout checkout) {
		return repository.save(checkout);
	}
	
	public List<Checkout> getCheckout() {
		return repository.findAll();
	}
}
