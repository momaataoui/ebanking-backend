package com.dev.ebanking.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompte;
    private String numeroCompte;
    private String typeCompte; // Courant ou Epargne
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date dateOuverture;
    private String statut;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Agence agence;

    @OneToMany(mappedBy = "compte", fetch = FetchType.LAZY)
    private List<Transaction> transactions;
}