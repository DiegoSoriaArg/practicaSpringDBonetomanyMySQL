package com.tutoria.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tutoria.onetomany.entity.Marca;
import com.tutoria.onetomany.entity.Modelo;
import com.tutoria.onetomany.repository.MarcaRepository;
import com.tutoria.onetomany.repository.ModeloRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	MarcaRepository marcaRepository;
	
	@Autowired
	ModeloRepository modeloRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Marca mercedes = new Marca("Mercedes"); Marca bmw = new Marca("BMW"); Modelo
		 * claseC = new Modelo("Clase C"); Modelo claseE = new Modelo("Calse E"); Modelo
		 * serie3 = new Modelo("Serie 3"); Modelo serie5 = new Modelo("Serie 5");
		 * 
		 * claseC.setMarca(mercedes); claseE.setMarca(mercedes); serie3.setMarca(bmw);
		 * serie5.setMarca(bmw);
		 * 
		 * Set<Modelo> modelosM = new HashSet<>(); Set<Modelo> modelosB = new
		 * HashSet<>();
		 * 
		 * modelosM.add(claseC); modelosM.add(claseE); modelosB.add(serie3);
		 * modelosB.add(serie5);
		 * 
		 * mercedes.setModelos(modelosM); bmw.setModelos(modelosB);
		 * 
		 * marcaRepository.save(mercedes); marcaRepository.save(bmw);
		 */
		
		/*
		 * Marca mercedes = marcaRepository.findById(1).get();
		 * mercedes.getModelos().stream().forEach(m -> System.out.println(m.getName()));
		 */
	}

}
