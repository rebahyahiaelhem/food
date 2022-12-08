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
	private String photoPlat;
	@Column  
	private int pricePlat;
	@Column  
	private int cookTime;
	
	
	
	
}
