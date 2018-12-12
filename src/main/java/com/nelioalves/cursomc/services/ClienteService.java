package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.repositories.ClienteRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundExceptiom;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente findByID(Integer id) {
		 Optional<Cliente> obj = repo.findById(id);
		 
		 //Retorna o objeto ou um erro, instancia a classe de erro com a msg do seu construtor
		 return obj.orElseThrow(() -> new ObjectNotFoundExceptiom(
				 "Objeto não encontrado! ID " + id + ",Tipo: " + Cliente.class.getName())); 
	}
	
}
