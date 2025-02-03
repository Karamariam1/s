package com.example.gestionIntervention.dao;

import com.example.gestionIntervention.entities.Intervenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntervenantDAO extends JpaRepository<Intervenant, Long> {
}
