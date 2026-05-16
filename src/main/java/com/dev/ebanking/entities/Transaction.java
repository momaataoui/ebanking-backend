package com.dev.ebanking.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_TRANS", length = 3)
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaction;
    private String type;
    private double montant;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTransaction;
    private String description;
    private String statut;

    @ManyToOne
    private Compte compte;
}