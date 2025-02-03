package com.example.gestionIntervention.metier;

import com.example.gestionIntervention.dao.PatientDAO;
import com.example.gestionIntervention.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPatientServiceImpl implements IPatientService{
    @Autowired
    PatientDAO patientDAO;
    @Override
    public Patient addPatient(Patient c) {
        return this.patientDAO.save(c);
    }

    @Override
    public Patient updatePatient(Patient c) {
        return this.patientDAO.save(c);
    }

    @Override
    public Patient getPatientById(Long id) {
        return this.patientDAO.findById(id).orElse(null);
    }

    @Override
    public void deletePatient(Long id) {
        this.patientDAO.deleteById(id);
    }

    @Override
    public List<Patient> getAllPatient() {
        return this.patientDAO.findAll();
    }
}
