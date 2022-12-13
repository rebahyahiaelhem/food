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

public class Plat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column  
	private int idPlat;  
	@Column  
	private String namePlat;  
	@Column  
	private String photo;
	@Column  
	private int pricePlat;

	
	@ManyToOne(optional=false)
	@JoinColumn(name="idRestaurant", referencedColumnName="idRestaurant")
	private Restaurant restaurant;


	public int getIdPlat() {
		return idPlat;
	}


	public void setIdPlat(int idPlat) {
		this.idPlat = idPlat;
	}


	public String getNamePlat() {
		return namePlat;
	}


	public void setNamePlat(String namePlat) {
		this.namePlat = namePlat;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public int getPricePlat() {
		return pricePlat;
	}


	public void setPricePlat(int pricePlat) {
		this.pricePlat = pricePlat;
	}


	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}


	@Override
	public String toString() {
		return "Plat [idPlat=" + idPlat + ", namePlat=" + namePlat + ", photo=" + photo + ", pricePlat=" + pricePlat
				+ ", restaurant=" + restaurant + "]";
	}
	
	

	

	
}
