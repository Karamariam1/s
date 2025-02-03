package com.example.gestionIntervention.dao;

import com.example.gestionIntervention.entities.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterventionDAO extends JpaRepository<Intervention, Long> {
    List<Intervention> findByTypeContaining(String type);
}
