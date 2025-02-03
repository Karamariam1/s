package com.example.gestionIntervention.metier;

import com.example.gestionIntervention.entities.Patient;

import java.util.List;

public interface IPatientService {
    public Patient addPatient(Patient c);
    public Patient updatePatient(Patient c);
    public Patient getPatientById(Long id);
    public void deletePatient(Long id);
    public List<Patient> getAllPatient();
}
