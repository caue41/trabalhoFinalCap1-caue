package com.devsuperior.trabalhoFinalCap1caue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.trabalhoFinalCap1caue.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
