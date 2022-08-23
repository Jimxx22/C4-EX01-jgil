package com.c6.ex01.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.c6.ex01.dto.Grupo;
import com.c6.ex01.dto.Videojuego;

public interface IGrupoDAO extends JpaRepository<Grupo, Long>{

	//Listar grupo or campo nombre
	public List<Grupo> findByGame(Long idVideojuego);
}
