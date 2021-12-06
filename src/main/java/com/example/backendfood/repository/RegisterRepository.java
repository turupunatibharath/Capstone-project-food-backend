package com.example.backendfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backendfood.entity.User;

public interface RegisterRepository extends JpaRepository<User,Integer>{

}
