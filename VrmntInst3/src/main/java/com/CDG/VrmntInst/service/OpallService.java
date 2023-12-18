package com.CDG.VrmntInst.service;

import com.CDG.VrmntInst.entity.Opall;
import com.CDG.VrmntInst.entity.Opret;
import com.CDG.VrmntInst.repository.OpallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.LinkedHashMap;


@Service
public class OpallService {

	private final OpallRepository OpallRepository;

	@Autowired
	public OpallService(OpallRepository OpallRepository) {
		this.OpallRepository = OpallRepository;
	}

	public List<Opall> getAllOpall() {
		return OpallRepository.findAll();
	}
	
	public Opall getOpallByRef(String reference) {
	    Optional<Opall> optionalOpall = OpallRepository.findByReference(reference);
	    return optionalOpall.orElse(null);
	}
	
	
	public Map<String, Long> countIntitules() {
	    Map<String, Long> intituleCounts = new HashMap<>();
	    List<Object[]> counts = OpallRepository.countIntitules();
	    for (Object[] count : counts) {
	        String intitule = (String) count[0];
	        if (intitule == null) {
	            intitule = "Unknown";
	        }
	        intituleCounts.put(intitule, (Long) count[1]);
	    }
	    return intituleCounts;
	}

	
	public Map<String, Double> avgMontantByIntitule() {
	    Map<String, Double> avgMontantMap = new HashMap<>();
	    List<Object[]> averages = OpallRepository.avgMontantByIntitule();
	    for (Object[] avg : averages) {
	        String intitule = (String) avg[0];
	        avgMontantMap.put(intitule, (Double) avg[1]);
	    }
	    return avgMontantMap;
	}
	
	
	public Map<String, Long> countOperationsPerDay() {
	    Map<String, Long> operationsCountMap = new LinkedHashMap<>();
	    List<Object[]> counts = OpallRepository.countOperationsPerDay();
	    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    for (Object[] count : counts) {
	        Date date = (Date) count[0];
	        operationsCountMap.put(dateFormat.format(date), ((Number) count[1]).longValue());
	    }
	    return operationsCountMap;
	}

	// Add other CRUD operations methods here
}
