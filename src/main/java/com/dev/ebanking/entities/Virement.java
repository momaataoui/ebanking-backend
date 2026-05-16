package com.dev.ebanking.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("VIR")
@Data @NoArgsConstructor @AllArgsConstructor
public class Virement extends Transaction {
    private Long compteSource;
    private Long compteDestination;
}