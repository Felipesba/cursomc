package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundExceptiom;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria findByID(Integer id) {
		 Optional<Categoria> obj = repo.findById(id);
		 
		 //Retorna o objeto ou um erro, instancia a classe de erro com a msg do seu construtor
		 return obj.orElseThrow(() -> new ObjectNotFoundExceptiom(
				 "Objeto não encontrado! ID " + id + ",Tipo: " + Categoria.class.getName())); 
	}
	
}
