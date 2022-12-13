
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Plat } from '../plat';
import { PlatService  } from '../plat.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  fruitForm: Plat = {
    idPlat: 0,
    namePlat: '',
    pricePlat: 0,
    photo: '',
    restaurant : 
      { idRestaurant: 1, nameRestaurant: '', adresse:'',phone:'',photo:'' }
  
  };
  constructor(
    private route: ActivatedRoute,
    private router:Router,
    private platService: PlatService
  ) {}
 
  ngOnInit(): void {
    this.route.paramMap.subscribe((param) => {
      var idPlat = Number(param.get('idPlat'));
      this.getById(idPlat);
    });
  }
 
  getById(idPlat: number) {
    this.platService.getById(idPlat).subscribe((data) => {
      this.fruitForm = data;
    });
  }
 
  update() {
    this.platService.update(this.fruitForm)
    .subscribe({
      next:(data) => {
        this.router.navigate(["/plat/home"]);
      },
      error:(err) => {
        console.log(err);
      }
    })
  }
}