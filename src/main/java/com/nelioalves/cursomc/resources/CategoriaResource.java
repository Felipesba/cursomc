package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.services.CategoriaService;

@RestController
public class CategoriaResource {
	
	@Autowired
	private CategoriaService catservice;
	
	@RequestMapping(value = "/categoriasold", method = RequestMethod.GET)
	public List<Categoria> listar(){
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);
		
		
		return lista;		
	}
	
	@RequestMapping(value = "/categorias/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id){
		Categoria cat = catservice.findByID(id);
		return ResponseEntity.ok().body(cat);
	}
}
