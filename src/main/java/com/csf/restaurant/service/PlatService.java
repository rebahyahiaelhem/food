package com.csf.restaurant.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.csf.restaurant.model.Plat;
import com.csf.restaurant.model.Restaurant;
import com.csf.restaurant.repository.PlatRepository;
import com.csf.restaurant.repository.RestaurantRepository;




@Service 
public class PlatService {

	@Autowired  
	PlatRepository Pr;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Plat> getAllPlats()   
	{  
		List<Plat> Plat = new ArrayList<Plat>();  
		Pr.findAll().forEach(p -> Plat.add(p));  
		return Plat;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Plat getPlatById(int idPlat)   
	{  
		return Pr.findById(idPlat).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Plat p)   
	{  
		Pr.save(p);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int idPlat)   
	{  
		Pr.deleteById(idPlat);  
	} 




}
