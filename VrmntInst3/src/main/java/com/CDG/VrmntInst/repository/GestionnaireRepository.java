package com.CDG.VrmntInst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CDG.VrmntInst.entity.Gestionnaire;

public interface GestionnaireRepository extends JpaRepository<Gestionnaire, Integer> {
}
