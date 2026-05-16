package com.dev.ebanking.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class AgentBancaire extends Utilisateur {
    private String matricule;
    private String agenceNom; // Correspond à 'agenceoe' sur ton diagramme
    private String poste;
}