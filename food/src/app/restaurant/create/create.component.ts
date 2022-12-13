
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Restaurant } from '../restaurant';
import { RestaurantService } from '../restaurant.service';
@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  fruitForm: Restaurant = {
    idRestaurant: 0,
    nameRestaurant: '',
    photo:'',
    phone:'',
    adresse:'',
  };
 
  constructor(private restaurantService:RestaurantService,
    private router:Router) {}
 
  ngOnInit(): void {}
 
  create(){
    this.restaurantService.create(this.fruitForm)
    .subscribe({
      next:(data) => {
        this.router.navigate(["/restaurant/home"])
      },
      error:(err) => {
        console.log(err);
      }
    })
  }
}