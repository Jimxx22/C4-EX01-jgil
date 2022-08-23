package com.c6.ex01.service;

import java.util.List;

import com.c6.ex01.dto.Videojuego;

public interface IVideojuegoService {

	public List<Videojuego> listVideojuegos(); // List all the Videojuegos
	
	public Videojuego listByName(String name);
	
	public Videojuego saveVideojuego(Videojuego videojuego); // Save a Grupo
	
	public Videojuego videojuegoXID(Long id); // List one Videojuego by id
	
	public void deleteVideojuego(Long id); // Delete Videojuego by id
}
