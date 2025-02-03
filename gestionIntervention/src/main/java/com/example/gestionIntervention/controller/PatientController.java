package com.example.gestionIntervention.controller;

import com.example.gestionIntervention.entities.Patient;
import com.example.gestionIntervention.metier.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/uni")
public class PatientController {
    @Autowired
    IPatientService patientService;
    @GetMapping("/patient")
    public List<Patient> getAllPatientFromDb(){
        return this.patientService.getAllPatient();
    }
    @GetMapping("/patient/{id}")
    public Patient getPatientByIdFromdb(@PathVariable("id") Long id) {
        return this.patientService.getPatientById(id);
    }
    @PostMapping("/patient")
    private Patient addPatientToDb(@RequestBody Patient c) {
        return this.patientService.addPatient(c);
    }
    @DeleteMapping("/patient/{id}")
    public void deleteClientByIdFromDb(@PathVariable("id") Long id) {
        this.patientService.deletePatient(id);
    }
}
