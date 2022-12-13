
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Restaurant } from '../restaurant';
import { RestaurantService } from '../restaurant.service';
@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  fruitForm: Restaurant = {
    idRestaurant: 0,
    nameRestaurant: '',
    photo: '',
    phone:'',
    adresse:'',
  };
  constructor(
    private route: ActivatedRoute,
    private router:Router,
    private restaurantService: RestaurantService
  ) {}
 
  ngOnInit(): void {
    this.route.paramMap.subscribe((param) => {
      var idRestaurant = Number(param.get('idRestaurant'));
      this.getById(idRestaurant);
    });
  }
 
  getById(idRestaurant: number) {
    this.restaurantService.getById(idRestaurant).subscribe((data) => {
      this.fruitForm = data;
    });
  }
 
  update() {
    this.restaurantService.update(this.fruitForm)
    .subscribe({
      next:(data) => {
        this.router.navigate(["/restaurant/home"]);
      },
      error:(err) => {
        console.log(err);
      }
    })
  }
}
