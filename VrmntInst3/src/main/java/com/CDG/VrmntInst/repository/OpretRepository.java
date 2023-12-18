package com.CDG.VrmntInst.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.CDG.VrmntInst.entity.Opall;
import com.CDG.VrmntInst.entity.Opret;

public interface OpretRepository extends JpaRepository<Opret, Integer> {
	
	@Query("SELECT r FROM Opret r, Opall o WHERE o.reference = r.refOrigine")
    List<Opret> findRejectedOperations();

    @Query("SELECT o FROM Opall o WHERE o.reference NOT IN (SELECT r.refOrigine FROM Opret r)")
    List<Opall> findAcceptedOperations();
	
	Optional<Opret> findByReference(String reference);
	
	@Query("SELECT o.motifR, COUNT(o) FROM Opret o WHERE o.reponse='rjct' GROUP BY o.motifR")
	List<Object[]> countMotifsRejet();

}
