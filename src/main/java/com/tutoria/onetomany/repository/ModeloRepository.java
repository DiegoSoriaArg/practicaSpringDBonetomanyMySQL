package com.tutoria.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutoria.onetomany.entity.Modelo;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Integer>{

}
