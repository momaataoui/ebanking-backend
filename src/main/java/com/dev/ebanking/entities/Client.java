package com.dev.ebanking.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Client extends Utilisateur {
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String telephone;
    private String adresse;
    private String pieceIdentite;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<Compte> comptes;
}