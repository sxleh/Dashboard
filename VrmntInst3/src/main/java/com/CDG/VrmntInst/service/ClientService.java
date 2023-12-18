package com.CDG.VrmntInst.service;

import com.CDG.VrmntInst.entity.Client;
import com.CDG.VrmntInst.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

	private final ClientRepository ClientRepository;

	@Autowired
	public ClientService(ClientRepository ClientRepository) {
		this.ClientRepository = ClientRepository;
	}

	public List<Client> getAllClient() {
		return ClientRepository.findAll();
	}
	
	public Client addClient(Client client) {
        return ClientRepository.save(client);
    }

	public Client getClientByRacine(int racine) {
	    Optional<Client> optionalClient = ClientRepository.findById(racine);
	    return optionalClient.orElse(null);
	}


	// Add other CRUD operations methods here
}
