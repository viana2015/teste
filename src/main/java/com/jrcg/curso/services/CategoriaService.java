package com.jrcg.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrcg.curso.domain.Categoria;
import com.jrcg.curso.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria busca(Integer id) {
		//Categoria obj = repo.findOne(id); java 7 funcionanva....
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null); 
	}
}
