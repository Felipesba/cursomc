package com.nelioalves.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.services.ClienteService;

@RestController
public class ClienteResource {
	
	@Autowired
	private ClienteService cliservice;
	
	
	@RequestMapping(value = "/clientes/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id){
		Cliente cat = cliservice.findByID(id);
		return ResponseEntity.ok().body(cat);
	}
}
