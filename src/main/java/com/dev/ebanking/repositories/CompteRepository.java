package com.dev.ebanking.repositories;

import com.dev.ebanking.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CompteRepository extends JpaRepository<Compte, Long> {
    // Pour retrouver un compte par son numéro (RIB)
    Optional<Compte> findByNumeroCompte(String numeroCompte);
}