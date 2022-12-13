import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CreateComponent } from './create/create.component';
import { EditComponent } from './edit/edit.component';
const routes: Routes = [
  {
    
    path: 'plat/home',
    component: HomeComponent,

  },
  {

    path:'plat/edit/:idPlat',
    component: EditComponent,
  },
  {

    path:'plat/create',
    component: CreateComponent,
  },
];
@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PlatRoutingModule { }
