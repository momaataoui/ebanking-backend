package com.dev.ebanking.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Administrateur extends Utilisateur {
    private String roleSpecial; // 'role' dans ton diagramme
}