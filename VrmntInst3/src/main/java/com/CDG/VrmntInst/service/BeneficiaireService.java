package com.CDG.VrmntInst.service;

import com.CDG.VrmntInst.entity.Beneficiaire;
import com.CDG.VrmntInst.repository.BeneficiaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiaireService {

	private final BeneficiaireRepository BeneficiaireRepository;

	@Autowired
	public BeneficiaireService(BeneficiaireRepository BeneficiaireRepository) {
		this.BeneficiaireRepository = BeneficiaireRepository;
	}

	public List<Beneficiaire> getAllBeneficiaire() {
		return BeneficiaireRepository.findAll();
	}

	// Add other CRUD operations methods here
}
