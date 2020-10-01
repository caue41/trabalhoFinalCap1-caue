package com.devsuperior.trabalhoFinalCap1caue.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.trabalhoFinalCap1caue.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		Locale.setDefault(Locale.US);
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Josué Ronaldo", "135.233.245.32", 3000.00, "13/11/1981", 2));
		list.add(new Client(1L, "Maria José", "313.290.442.12", 3000.00, "13/11/1985", 2));
		list.add(new Client(1L, "Mario Junior", "111.222.333.45", 3000.00, "13/11/1973", 2));
		return ResponseEntity.ok().body(list);
	}
}
