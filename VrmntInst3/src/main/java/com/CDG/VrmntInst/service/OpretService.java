package com.CDG.VrmntInst.service;

import com.CDG.VrmntInst.entity.Opall;
import com.CDG.VrmntInst.entity.Opret;
import com.CDG.VrmntInst.repository.OpretRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class OpretService {

	private final OpretRepository OpretRepository;

	@Autowired
	public OpretService(OpretRepository OpretRepository) {
		this.OpretRepository = OpretRepository;
	}

	public List<Opret> getAllOpret() {
		return OpretRepository.findAll();
	}

	public Map<String, Integer> countResponses() {
        Map<String, Integer> responseCounts = new HashMap<>();
        responseCounts.put("ACSC", getAcceptedOperations().size());
        responseCounts.put("RJCT", getRejectedOperations().size());
        return responseCounts;
    }
    
    public List<Opret> getRejectedOperations() {
        return OpretRepository.findRejectedOperations();
    }

    public List<Opall> getAcceptedOperations() {
        return OpretRepository.findAcceptedOperations();
    }

    
    public Opret getOpretByRef(String reference) {
	    Optional<Opret> optionalOpret = OpretRepository.findByReference(reference);
	    return optionalOpret.orElse(null);
	}
    
    public Map<String, Long> countMotifsRejet() {
        Map<String, Long> motifCounts = new HashMap<>();
        List<Object[]> counts = OpretRepository.countMotifsRejet();
        for (Object[] count : counts) {
            String motifR = (String) count[0];
            if (motifR == null) {
                motifR = "Unknown";
            }
            motifCounts.put(motifR, (Long) count[1]);
        }
        return motifCounts;
    }

    
}
