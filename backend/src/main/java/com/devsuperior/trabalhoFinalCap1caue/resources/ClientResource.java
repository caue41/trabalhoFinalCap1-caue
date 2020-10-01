package com.devsuperior.trabalhoFinalCap1caue.resources;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.trabalhoFinalCap1caue.dto.ClientDTO;
import com.devsuperior.trabalhoFinalCap1caue.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll(){
		Locale.setDefault(Locale.US);
		List<ClientDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
