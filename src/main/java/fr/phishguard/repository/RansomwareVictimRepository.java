package fr.phishguard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.phishguard.model.entity.*;

public interface RansomwareVictimRepository extends JpaRepository<RansomwareVictimEntity, Long> {
}
