import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Patient } from '../models/patient';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
  constructor(private http:HttpClient) { }
  baseUrl:string="http://localhost:8181/uni"
  getAllPatient():Observable<Patient[]>{
    return this.http.get<Patient[]>(this.baseUrl+"/patient")
  }
  addPatient(p:Patient):Observable<Patient>{
    return this.http.post<Patient>(this.baseUrl+"/patient",p)
  }
}
