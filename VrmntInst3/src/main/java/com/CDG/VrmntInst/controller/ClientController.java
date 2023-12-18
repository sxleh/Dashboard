package com.CDG.VrmntInst.controller;

import com.CDG.VrmntInst.entity.Client;
import com.CDG.VrmntInst.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@RestController
@RequestMapping(path = "/client")
public class ClientController {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientController.class);
    private final ClientService ClientService;

    @Autowired
    public ClientController(ClientService ClientService) {
        this.ClientService = ClientService;
    }

    @GetMapping
    public List<Client> getAllClient() {
        List<Client> clients = ClientService.getAllClient();
        return clients;
    }

    
    @PostMapping
    public Client addClient(@RequestBody Client newClient) {
        return ClientService.addClient(newClient);
    }

    @GetMapping("/{racine}")
    public Client getClientByRacine(@PathVariable int racine) {
        Client client = ClientService.getClientByRacine(racine);
        if (client == null) {
            throw new RuntimeException("Pas de client ayant la Racine: " + racine);
        }
        return client;
    }
}
