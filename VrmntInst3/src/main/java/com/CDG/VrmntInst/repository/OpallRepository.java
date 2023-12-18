package com.CDG.VrmntInst.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.CDG.VrmntInst.entity.Opall;
import com.CDG.VrmntInst.entity.Opret;

public interface OpallRepository extends JpaRepository<Opall, Integer> {
	Optional<Opall> findByReference(String reference);
	
	
	@Query("SELECT o.intitule, COUNT(o) FROM Opall o GROUP BY o.intitule")
	List<Object[]> countIntitules();
	
	@Query("SELECT o.intitule, AVG(o.montant) FROM Opall o WHERE o.intitule IN ('web', 'agence') GROUP BY o.intitule")
	List<Object[]> avgMontantByIntitule();

	@Query("SELECT DATE(o.dateOperation), COUNT(o) FROM Opall o GROUP BY DATE(o.dateOperation)")
	List<Object[]> countOperationsPerDay();

}
