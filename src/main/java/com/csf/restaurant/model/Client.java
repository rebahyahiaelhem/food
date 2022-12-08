package com.csf.restaurant.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
  

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table 
//Defining book id as primary key 

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column  
	private int idClient;  
	@Column  
	private String nameClient;  
	@Column  
	private String adresseClient;
	@Column
	private String  phoneClient;
	@Column  
	private String email;  
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getNameClient() {
		return nameClient;
	}
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}
	public String getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	public String getPhoneClient() {
		return phoneClient;
	}
	public void setPhoneClient(String phoneClient) {
		this.phoneClient = phoneClient;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nameClient=" + nameClient + ", adresseClient=" + adresseClient
				+ ", phoneClient=" + phoneClient + ", email=" + email + "]";
	}
	
	
	
	
	
}
