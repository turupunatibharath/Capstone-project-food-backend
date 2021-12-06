package com.example.backendfood.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {

	@Id
	@GeneratedValue
	private int id;
	private String emailId;
	private String password;
	
	
	public Login() {
		super();
	}
	
	public Login(int id, String emailId, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
