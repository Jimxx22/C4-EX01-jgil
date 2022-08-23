package com.c6.ex01.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.c6.ex01.dto.Mensaje;
import com.c6.ex01.dto.Videojuego;

public interface IMensajeDAO extends JpaRepository<Mensaje, Long>{

	//Listar clientes or campo nombre
	public List<Mensaje> findByGroup(Long id);
}
