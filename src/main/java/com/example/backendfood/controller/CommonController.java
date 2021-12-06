package com.example.backendfood.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.example.backendfood.entity.Checkout;
import com.example.backendfood.entity.Crud;
import com.example.backendfood.entity.Login;
import com.example.backendfood.entity.Product;
import com.example.backendfood.entity.User;
import com.example.backendfood.repository.RegisterRepository;
import com.example.backendfood.service.CheckoutService;
import com.example.backendfood.service.CrudService;
import com.example.backendfood.service.LoginService;
import com.example.backendfood.service.ProductService;
import com.example.backendfood.service.RegisterService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("common")
public class CommonController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }
    
    @GetMapping("/product/{id}")
    public Product findproductbyid(@PathVariable int id) {
    	return service.getitemById(id);
    }
    
    @PutMapping("/updateproduct/{id}")
    public Product updateproduct(@RequestBody Product product) {
    	return service.updateproduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
    
    
    @Autowired
    private RegisterService registerservice;
    
    @PostMapping("/adduser")
    public User addUser(@RequestBody User user) {
    	return registerservice.saveUser(user);
    	
    }
    
    @PostMapping("/addusers")
    public List<User> addUsers(@RequestBody List<User> users){
    	return registerservice.saveUsers(users);
    }
    
    @GetMapping("/getusers")
    public List<User> findAllUsers(){
    	return registerservice.getUsers();
    }
    
    @Autowired
    private LoginService loginservice;
    
    @PostMapping("/addlogin")
    public Login addLogin(@RequestBody Login login) {
    	return loginservice.saveLogin(login);
    }
    
    @GetMapping("/getlogin")
    public List<Login> findAllLogin(){
    	return loginservice.getLogin();
    }
    
    
    @Autowired
    private CheckoutService checkoutservice;
    
    @PostMapping("/addcheckout")
    public Checkout addCheckout(@RequestBody Checkout checkout) {
    	return checkoutservice.saveCheckout(checkout);
    	
    }

    
    @GetMapping("/getcheckout")
    public List<Checkout> findAllCheckouts(){
    	return checkoutservice.getCheckout();
    }
    
}
