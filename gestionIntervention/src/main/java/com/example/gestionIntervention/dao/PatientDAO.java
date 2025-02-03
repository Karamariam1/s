package com.example.gestionIntervention.dao;

import com.example.gestionIntervention.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDAO extends JpaRepository<Patient, Long> {
}
