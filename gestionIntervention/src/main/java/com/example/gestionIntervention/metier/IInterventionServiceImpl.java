package com.example.gestionIntervention.metier;

import com.example.gestionIntervention.dao.InterventionDAO;
import com.example.gestionIntervention.entities.Intervention;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IInterventionServiceImpl implements IInterventionService{
    @Autowired
    InterventionDAO interventionDAO;
    @Override
    public Intervention addIntervention(Intervention d) {
        return this.interventionDAO.save(d);
    }

    @Override
    public Intervention getInterventionById(Long id) {
        return this.interventionDAO.findById(id).orElse(null);
    }

    @Override
    public List<Intervention> getAllIntervention() {
        return this.interventionDAO.findAll();
    }

    @Override
    public List<Intervention> getInterventionByType(String type) {
        return this.interventionDAO.findByTypeContaining(type);
    }
}
