import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Patient } from 'src/app/models/patient';
import { PatientService } from 'src/app/services/patient.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent {
  p:Patient={
    id:0,
    nom:"",
    adresse:"",
    age:0
  }
  constructor(private patientService:PatientService,private route:Router){}
  Add(){
    //console.log(this.p);
    this.patientService.addPatient(this.p).subscribe((res)=>{
      alert('Patient Added Successfully');
      this.route.navigate(["/list"])
    })
  }
}
