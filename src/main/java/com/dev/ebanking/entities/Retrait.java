package com.dev.ebanking.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("RET")
@Data @NoArgsConstructor @AllArgsConstructor
public class Retrait extends Transaction {
    private String modeRetrait;
}