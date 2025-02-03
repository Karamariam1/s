package com.example.gestionIntervention.metier;

import com.example.gestionIntervention.entities.Intervention;

import java.util.List;

public interface IInterventionService {
    public Intervention addIntervention(Intervention d);
    public Intervention getInterventionById(Long id);
    public List<Intervention> getAllIntervention();
    public List<Intervention> getInterventionByType(String type);
}
