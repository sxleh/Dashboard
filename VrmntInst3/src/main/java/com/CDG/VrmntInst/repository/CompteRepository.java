package com.CDG.VrmntInst.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CDG.VrmntInst.entity.Compte;
import com.CDG.VrmntInst.entity.Opret;

public interface CompteRepository extends JpaRepository<Compte, Integer> {
	Optional<Compte> findByNumCompte(String numCompte);
}
