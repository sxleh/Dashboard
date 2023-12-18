package com.CDG.VrmntInst.service;

import com.CDG.VrmntInst.entity.Compte;
import com.CDG.VrmntInst.entity.Opret;
import com.CDG.VrmntInst.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompteService {

	private final CompteRepository CompteRepository;

	@Autowired
	public CompteService(CompteRepository CompteRepository) {
		this.CompteRepository = CompteRepository;
	}

	public List<Compte> getAllCompte() {
		return CompteRepository.findAll();
	}
	
	public Compte addCompte(Compte Compte) {
        return CompteRepository.save(Compte);
    }

	
	public Compte getCompteByNumCompte(String numCompte) {
	    Optional<Compte> optionalCompte = CompteRepository.findByNumCompte(numCompte);
	    return optionalCompte.orElse(null);
	}
	// Add other CRUD operations methods here
}
