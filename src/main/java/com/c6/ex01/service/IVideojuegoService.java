package com.c6.ex01.service;

import java.util.List;

import com.c6.ex01.dto.Videojuego;

public interface IVideojuegoService {

	public List<Videojuego> listVideojuegos(); // List all the Videojuegos
	
	public Videojuego saveVideojuego(Videojuego videojuego); // Save a Videojuego
	
	public Videojuego videojuegoXID(Long id); // List one Videojuego by id
	
	public Videojuego updateVideojuego(Videojuego videojuego); // Update Videojuego
	
	public void deleteVideojuego(Long id); // Delete Videojuego by id
}
