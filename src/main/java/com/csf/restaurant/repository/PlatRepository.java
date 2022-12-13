package com.csf.restaurant.repository;


import org.springframework.data.repository.CrudRepository;

import com.csf.restaurant.model.Plat;
import com.csf.restaurant.model.Restaurant;




public interface PlatRepository  extends CrudRepository<Plat, Integer>{

}
