package com.tutoria.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutoria.onetomany.entity.Marca;

@Repository
public interface MarcaRepository  extends JpaRepository<Marca, Integer>{

}
