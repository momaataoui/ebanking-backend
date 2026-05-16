package com.dev.ebanking.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Agence {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nomAgence;
    private String adresse;
    private String ville;
    private String telephone;

    @OneToMany(mappedBy = "agence")
    private List<Compte> comptes;
}