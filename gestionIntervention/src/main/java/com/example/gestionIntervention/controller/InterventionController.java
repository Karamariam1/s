package com.example.gestionIntervention.controller;

import com.example.gestionIntervention.entities.Intervention;
import com.example.gestionIntervention.metier.IInterventionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/uni")
public class InterventionController {
    @Autowired
    IInterventionService interventionService;
    @GetMapping("/intervention")
    public List<Intervention> getAllInterventionFromDb(){
        return this.interventionService.getAllIntervention();
    }
    @PostMapping("/intervention")
    private Intervention addInterventionToDb(@RequestBody Intervention d) {
        return this.interventionService.addIntervention(d);
    }
}
