package com.csf.restaurant.controller;


import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csf.restaurant.model.Restaurant;
import com.csf.restaurant.service.RestaurantService;



@RestController 
@CrossOrigin(origins = "*")
public class RestaurantController {
	
	//autowire the BooksService class  
		@Autowired  
		RestaurantService rS;  

		//creating a get mapping that retrieves all the books detail from the database   
		@GetMapping("/restaurant")
		
		private List<Restaurant> getAllRestaurants()   
		{  
			return rS.getAllRestaurants();  
		}  

		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/restaurant/{idRestaurant}")  
		private Restaurant getRestaurant(@PathVariable("ididRestaurant") int idRestaurant)   
		{  
			return rS.getRestaurantById(idRestaurant);  
		}  


		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/restaurant/{productid}")  
		private void deleteRestaurant(@PathVariable("productid") int idRestaurant)   
		{  
			rS.delete(idRestaurant) ;
		} 

		@PostMapping("/restaurant")  
		private int saveProduct(@RequestBody Restaurant r)   
		{  
			rS.saveOrUpdate(r);
			return r.getIdRestaurant();  
		} 

		//creating put mapping that updates the book detail
		//@CrossOrigin(origins = "*")
		@PutMapping("/restaurant")  
		private Restaurant update(@RequestBody  Restaurant r)   
		{  
			rS.saveOrUpdate(r);  
			return r;  
		}  
}
