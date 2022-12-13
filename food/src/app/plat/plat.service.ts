
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Plat } from './plat';
@Injectable({
  providedIn: 'root'
})
export class PlatService {

  constructor(private http: HttpClient) {
    
  }
  get() {
    return this.http.get<Plat[]>('http://localhost:8080/plat');
  }
  create(payload: Plat) {
    console.log("REST : ",payload);
    return this.http.post<Plat>('http://localhost:8080/plat', payload);
    
  }
  getById(id: number) {
    return this.http.get<Plat>('http://localhost:8080/plat/'+id);
   }
   update(payload:Plat){
    return this.http.put('http://localhost:8080/plat',payload);
   }
   delete(id:number){
    return this.http.delete<Plat>('http://localhost:8080/plat/${id}');
 }
}
