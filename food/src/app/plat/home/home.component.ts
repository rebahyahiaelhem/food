
import { Component, OnInit } from '@angular/core';
import { Plat } from '../plat';
import { PlatService } from '../plat.service';
declare var window: any;
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  allPlats: Plat[] = [];
  deleteModal: any;
  idTodelete: number = 0;
  constructor(private platService:PlatService) {}
 
  ngOnInit(): void {
    this.deleteModal = new window.bootstrap.Modal(
        document.getElementById('deleteModal')
      );
      
    this.get();

  }
  get() {
    this.platService.get().subscribe((data) => {
      this.allPlats = data;
    });
  }
  openDeleteModal(id: number) {
    this.idTodelete = id;
    this.deleteModal.show();
  }
 
  delete() {
    this.platService.delete(this.idTodelete).subscribe({
      next: (data) => {
        this.allPlats = this.allPlats.filter(_ => _.idPlat != this.idTodelete)
        this.deleteModal.hide();
      },
    });
  }
}
