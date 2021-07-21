package com.tutoria.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutoria.onetomany.entity.Marca;
import com.tutoria.onetomany.entity.Modelo;
import com.tutoria.onetomany.repository.MarcaRepository;
import com.tutoria.onetomany.repository.ModeloRepository;

@Service
public class MainService {
	
	@Autowired
	MarcaRepository marcaRepository;
	
	@Autowired
	ModeloRepository modeloRepository;
	
	public List<Marca> marcas(){
		return marcaRepository.findAll();
	}
	
	public List<Modelo> modelos(){
		return modeloRepository.findAll();
	}
	
	public void deleteMarca(int id) {
		marcaRepository.deleteById(id);
	}

}
