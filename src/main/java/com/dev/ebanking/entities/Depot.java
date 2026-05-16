package com.dev.ebanking.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("DEP")
@Data @NoArgsConstructor @AllArgsConstructor
public class Depot extends Transaction {
    private String modeDepot;
}