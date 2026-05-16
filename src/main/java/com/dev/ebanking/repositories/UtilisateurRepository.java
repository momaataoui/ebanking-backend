package com.dev.ebanking.repositories;

import com.dev.ebanking.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findByNomUtilisateur(String nom);
    Utilisateur findByEmail(String email);
}