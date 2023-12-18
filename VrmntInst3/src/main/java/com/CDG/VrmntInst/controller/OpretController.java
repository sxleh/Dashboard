package com.CDG.VrmntInst.controller;

import com.CDG.VrmntInst.entity.Client;
import com.CDG.VrmntInst.entity.Opall;
import com.CDG.VrmntInst.entity.Opret;
import com.CDG.VrmntInst.service.OpretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;



@RestController
@RequestMapping(path = "/opret")
public class OpretController {

    private final OpretService OpretService;

    @Autowired
    public OpretController(OpretService OpretService) {
        this.OpretService = OpretService;
    }

    @GetMapping
    public List<Opret> getAllOpret() {
        return OpretService.getAllOpret();
    }

    @GetMapping(path = "/reponse")
    public Map<String, Integer> getResponseCounts() {
      return OpretService.countResponses();
    }
    
    
    @GetMapping("/rjctList")
    public List<Opret> getRjctList() {
        return OpretService.getRejectedOperations();
    }

    @GetMapping("/acscList")
    public List<Opall> getAcscList() {
        return OpretService.getAcceptedOperations();
    }
    
    
    @GetMapping("/{reference}")
    public Opret getOpretByRef(@PathVariable String reference) {
        Opret Opret = OpretService.getOpretByRef(reference);
        if (Opret == null) {
            throw new RuntimeException("Pas d'operation ayant la reference: " + reference);
        }
        return Opret;
    }
    
    @GetMapping(path = "/motifRejet")
    public Map<String, Long> getMotifRejetCounts() {
        return OpretService.countMotifsRejet();
    }

    

    
}
