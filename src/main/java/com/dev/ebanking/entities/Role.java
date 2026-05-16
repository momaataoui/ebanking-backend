package com.dev.ebanking.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;
    private String nomRole;
    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Permission> permissions;
}