package com.csf.restaurant.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.csf.restaurant.model.Restaurant;
import com.csf.restaurant.repository.RestaurantRepository;




@Service 
public class RestaurantService {

	@Autowired  
	RestaurantRepository Rp;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Restaurant> getAllRestaurants()   
	{  
		List<Restaurant> restau = new ArrayList<Restaurant>();  
		Rp.findAll().forEach(p -> restau.add(p));  
		return restau;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Restaurant getRestaurantById(int id)   
	{  
		return Rp.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Restaurant p)   
	{  
		Rp.save(p);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		Rp.deleteById(id);  
	} 




}
