
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CreateComponent } from './create/create.component';
import { EditComponent } from './edit/edit.component';
const routes: Routes = [
  {
    
  path: 'restaurant/home',
  component: HomeComponent,

},
{

  path:'restaurant/edit/:idRestaurant',
  component: EditComponent,
},
{

  path:'restaurant/create',
  component: CreateComponent
},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class RestaurantRoutingModule { }
