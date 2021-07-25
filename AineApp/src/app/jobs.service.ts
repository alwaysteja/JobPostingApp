import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Jobs } from './jobs';

@Injectable({
  providedIn: 'root'
})
export class JobsService {
  
  private baseUrl="http://localhost:8090/jobs";
  constructor(private http:HttpClient) { }
  getJobsList():Observable<Jobs[]> {
    return this.http.get<Jobs[]>(this.baseUrl);
   }

   createJob(job:Jobs):Observable<Object>{
     return this.http.post(this.baseUrl,job);
   }
   

}

