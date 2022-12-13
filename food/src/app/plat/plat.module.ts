import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PlatRoutingModule } from './plat-routing.module';
import { HomeComponent } from './home/home.component';
import { CreateComponent } from './create/create.component';
import { EditComponent } from './edit/edit.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    HomeComponent,
    CreateComponent,
    EditComponent
  ],
  imports: [
    CommonModule,
    PlatRoutingModule,
    FormsModule
  ]
})
export class PlatModule { }
