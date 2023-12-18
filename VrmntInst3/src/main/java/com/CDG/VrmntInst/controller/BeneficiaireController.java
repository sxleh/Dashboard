package com.CDG.VrmntInst.controller;

import com.CDG.VrmntInst.entity.Beneficiaire;
import com.CDG.VrmntInst.service.BeneficiaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/beneficiaire")
public class BeneficiaireController {

    private final BeneficiaireService BeneficiaireService;

    @Autowired
    public BeneficiaireController(BeneficiaireService BeneficiaireService) {
        this.BeneficiaireService = BeneficiaireService;
    }

    @GetMapping
    public List<Beneficiaire> getAllBeneficiaire() {
        return BeneficiaireService.getAllBeneficiaire();
    }

    // Add other CRUD operations endpoints here
}
