
import { ConditionalExpr } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Restaurant } from 'src/app/restaurant/restaurant';
import { RestaurantService } from 'src/app/restaurant/restaurant.service';
import { Plat } from '../plat';
import { PlatService } from '../plat.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  fruitForm: Plat = {
    idPlat: 0,
    namePlat: '',
    pricePlat: 0,
    photo:'',
    restaurant : 
      { idRestaurant: 0, nameRestaurant: '', adresse:'',phone:'',photo:'' }
      
    
  };
 
  //listes des restaurants
  restaurants : Restaurant[] = [];

  constructor(private platService:PlatService,
    private restaurantService:RestaurantService,
    private router:Router) {
      this.getRestaurants();;

    }
 
  ngOnInit(): void {}
 //listes des restaurants
  getRestaurants() {
    this.restaurantService.get().subscribe((data) => {
      this.restaurants = data;
      console.log("restaurants = ",this.restaurants);
    });
  }





  create(){
    this.platService.create(this.fruitForm)
    .subscribe({
      next:(data) => {
        this.router.navigate(["/plat/home"])
      },
      error:(err) => {
        console.log(err);
      }
    })
  }
}