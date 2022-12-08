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

import com.csf.restaurant.model.Plat;
import com.csf.restaurant.model.Restaurant;
import com.csf.restaurant.service.PlatService;
import com.csf.restaurant.service.RestaurantService;



@RestController 
//@CrossOrigin(origins = "*")
public class PlatController {
	
	//autowire the BooksService class  
		@Autowired  
		 PlatService rS;  

		//creating a get mapping that retrieves all the books detail from the database   
		@GetMapping("/ plat")
		
		private List< Plat> getAllPlats()   
		{  
			return rS.getAllPlats();  
		}  

		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/ plat/{idPlat}")  
		private  Plat getPlat(@PathVariable("idPlat") int idPlat)   
		{  
			return rS.getPlatById(idPlat);  
		}  


		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/ plat/{ platid}")  
		private void deletePlat(@PathVariable(" platid") int id)   
		{  
			rS.delete(id) ;
		} 

		@PostMapping("/ plat")  
		private int savePlat(@RequestBody  Plat r)   
		{  
			rS.saveOrUpdate(r);
			return r.getIdPlat();  
		} 

		//creating put mapping that updates the book detail
		//@CrossOrigin(origins = "*")
		@PutMapping("/ plat")  
		private  Plat update(@RequestBody   Plat r)   
		{  
			rS.saveOrUpdate(r);  
			return r;  
		}  
}
