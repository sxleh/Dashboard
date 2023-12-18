package com.CDG.VrmntInst.controller;

import com.CDG.VrmntInst.entity.Opall;
import com.CDG.VrmntInst.entity.Opret;
import com.CDG.VrmntInst.service.OpallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/opall")
public class OpallController {

    private final OpallService OpallService;

    @Autowired
    public OpallController(OpallService OpallService) {
        this.OpallService = OpallService;
    }

    @GetMapping
    public List<Opall> getAllOpall() {
        return OpallService.getAllOpall();
    }

    @GetMapping("/{reference}")
    public Opall getOpallByRef(@PathVariable String reference) {
    	Opall Opall = OpallService.getOpallByRef(reference);
        if (Opall == null) {
            throw new RuntimeException("Pas d'operation ayant la reference: " + reference);
        }
        return Opall;
    }
    
    @GetMapping(path = "/typeCount")
    public Map<String, Long> getIntituleCounts() {
        return OpallService.countIntitules();
    }
    
    @GetMapping(path = "/avgMontantBytType")
    public Map<String, Double> getAvgMontantByIntitule() {
        return OpallService.avgMontantByIntitule();
    }


    @GetMapping(path = "/countOperationsPerDay")
    public Map<String, Long> getCountOperationsPerDay() {
        return OpallService.countOperationsPerDay();
    }

    // Add other CRUD operations endpoints here
}
