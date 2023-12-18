package com.CDG.VrmntInst.controller;

import com.CDG.VrmntInst.entity.Gestionnaire;
import com.CDG.VrmntInst.service.GestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/gestionnaire")
public class GestionnaireController {

    private final GestionnaireService GestionnaireService;

    @Autowired
    public GestionnaireController(GestionnaireService GestionnaireService) {
        this.GestionnaireService = GestionnaireService;
    }

    @GetMapping
    public List<Gestionnaire> getAllGestionnaire() {
        return GestionnaireService.getAllGestionnaire();
    }

    // Add other CRUD operations endpoints here
}
