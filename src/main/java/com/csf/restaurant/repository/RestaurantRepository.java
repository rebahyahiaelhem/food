package com.csf.restaurant.repository;


import org.springframework.data.repository.CrudRepository;

import com.csf.restaurant.model.Restaurant;




public interface RestaurantRepository  extends CrudRepository<Restaurant, Integer>{

}
