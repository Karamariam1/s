package com.example.gestionIntervention;

import com.example.gestionIntervention.entities.Patient;
import com.example.gestionIntervention.dao.PatientDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionInterventionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionInterventionApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PatientDAO patientRepository) {
		return args -> {
			patientRepository.save(new Patient(null, "Ali", "Smara", 5, null));
			patientRepository.save(new Patient(null, "Khalid", "Casablanca", 32, null));
			patientRepository.save(new Patient(null, "Samira", "Rabat", 45, null));
			System.out.println("Patients ajoutés avec succès !");
		};
	}
}
