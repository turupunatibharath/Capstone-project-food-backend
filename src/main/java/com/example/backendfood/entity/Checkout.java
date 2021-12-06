package com.example.backendfood.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="checkout")
public class Checkout {
	
	@Id
	@GeneratedValue
	private int id;
	private String fullname;
	private String emailId;
	private int phonenumber;
	private String address;
	private String pincode;
	
	
	public Checkout() {
		super();
	}
	public Checkout(int id, String fullname, String emailid, int phonenumber, String address, String pincode) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.emailId = emailid;
		this.phonenumber = phonenumber;
		this.address = address;
		this.pincode = pincode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailid) {
		this.emailId = emailid;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
	
}
