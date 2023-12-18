package com.CDG.VrmntInst.service;

import com.CDG.VrmntInst.entity.Gestionnaire;
import com.CDG.VrmntInst.repository.GestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionnaireService {

	private final GestionnaireRepository GestionnaireRepository;

	@Autowired
	public GestionnaireService(GestionnaireRepository GestionnaireRepository) {
		this.GestionnaireRepository = GestionnaireRepository;
	}

	public List<Gestionnaire> getAllGestionnaire() {
		return GestionnaireRepository.findAll();
	}

	// Add other CRUD operations methods here
}
