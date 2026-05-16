package com.dev.ebanking.repositories;

import com.dev.ebanking.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    // Spring va comprendre tout seul cette méthode et créer le SQL !
    List<Client> findByNomContains(String mc);
}