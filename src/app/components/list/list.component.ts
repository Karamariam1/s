import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Patient } from 'src/app/models/patient';
import { PatientService } from 'src/app/services/patient.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent {
  constructor(private patientService:PatientService,private route:Router){}
  patientList:Patient[]=[];
  ngOnInit():void{
    this.patientService.getAllPatient().subscribe((res)=>{
      this.patientList=res
    })
  }
  toAdd(){
    this.route.navigate(["/add"])
  }
}
