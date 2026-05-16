package com.dev.ebanking.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class JournalAudit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLog;
    private Long utilisateurId;
    private String action;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAction;
    private String details;
}