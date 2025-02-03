package com.example.gestionIntervention.entities;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private Date date_intervention;
    private String type;
    private String description;
    @ManyToMany
    private List<Intervenant> intervenants;
    @ManyToOne
    private Patient patient;
}
