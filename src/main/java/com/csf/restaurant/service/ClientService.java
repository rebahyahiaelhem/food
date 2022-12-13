package com.csf.restaurant.service;



import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;


import com.csf.restaurant.repository.ClientRepository;


import com.csf.restaurant.model.Client;




@Service 
public class ClientService {

	@Autowired  
	ClientRepository Cr;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Client> getAllClients()   
	{  
		List<Client> cl = new ArrayList<Client>();  
		Cr.findAll().forEach(c -> cl.add(c));  
		return cl;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Client getClientById(int idClient)   
	{  
		return Cr.findById(idClient).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Client c)   
	{  
		Cr.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int idClient)   
	{  
		Cr.deleteById(idClient);  
	} 




}

