package com.dev.ebanking.repositories;

import com.dev.ebanking.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Pour retrouver toutes les transactions d'un compte spécifique
    List<Transaction> findByCompteIdCompte(Long idCompte);
}