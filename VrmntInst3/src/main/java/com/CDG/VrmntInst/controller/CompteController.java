package com.CDG.VrmntInst.controller;

import com.CDG.VrmntInst.entity.Compte;
import com.CDG.VrmntInst.entity.Opret;
import com.CDG.VrmntInst.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@RestController
@RequestMapping(path = "/compte")
public class CompteController {
	
	private static final Logger logger = LoggerFactory.getLogger(CompteController.class);
    private final CompteService CompteService;

    @Autowired
    public CompteController(CompteService CompteService) {
        this.CompteService = CompteService;
    }

    @GetMapping
    public List<Compte> getAllCompte() {
        logger.info("Getting all Comptes");
        List<Compte> Comptes = CompteService.getAllCompte();
        logger.info("Number of Comptes found: " + Comptes.size());
        return Comptes;
    }

    
    @PostMapping
    public Compte addCompte(@RequestBody Compte newCompte) {
        return CompteService.addCompte(newCompte);
    }
    
    @GetMapping("/{numCompte}")
    public Compte getCompteByNumCompte(@PathVariable String numCompte) {
    	Compte Compte = CompteService.getCompteByNumCompte(numCompte);
        if (Compte == null) {
            throw new RuntimeException("Pas de compte ayant la numero: " + numCompte);
        }
        return Compte;
    }
}
