package com.CDG.VrmntInst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CDG.VrmntInst.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
