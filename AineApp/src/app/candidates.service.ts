import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Candidates } from './candidates';

@Injectable({
  providedIn: 'root'
})
export class CandidatesService {
  private baseUrl="http://localhost:8070/candidates";
  constructor(private http:HttpClient) { }
  getCanList():Observable<Candidates[]> {
    return this.http.get<Candidates[]>(this.baseUrl);
   }
   Apply(can:Candidates):Observable<Object>{
    return this.http.post(this.baseUrl,can);
  }
}

  

   