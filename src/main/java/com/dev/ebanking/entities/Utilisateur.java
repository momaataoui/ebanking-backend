package com.dev.ebanking.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;
    private String nomUtilisateur;
    private String email;
    private String motDePasse;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private boolean statut;

    @ManyToOne
    private Role role;
}