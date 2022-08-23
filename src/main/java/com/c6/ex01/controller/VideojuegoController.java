package com.c6.ex01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c6.ex01.dto.Grupo;
import com.c6.ex01.dto.Videojuego;
import com.c6.ex01.service.VideojuegoServiceImpl;

@RestController
@RequestMapping("/api")
public class VideojuegoController {

	@Autowired
	VideojuegoServiceImpl videojuegoServiceImpl;
	
	@GetMapping("/videojuegos")
	public List<Videojuego> listVideojuegos(){	
		return videojuegoServiceImpl.listVideojuegos();	
	}
	
	@GetMapping("/videojuegos/{id}")
	public Videojuego VideojuegoXID(@PathVariable(name="id")Long id) {
		Videojuego videojuegoXID = new Videojuego();
		videojuegoXID=videojuegoServiceImpl.videojuegoXID(id);
		
		return videojuegoXID;
	}
	
	@GetMapping("/videojuegos/name/{nom}")
	public Videojuego listByName(@PathVariable(name="nom")String nom){	
		return videojuegoServiceImpl.listByName(nom);	
	}
	
	@PostMapping("/videojuegos")
	public Videojuego saveGrupo(@RequestBody Videojuego videojuego) {
		return videojuegoServiceImpl.saveVideojuego(videojuego);
	}
	
	@DeleteMapping("/videojuegos/{id}")
	public String deleteGrupo(@PathVariable(name="id")Long id) {
		try {
			videojuegoServiceImpl.deleteVideojuego(id);
			return "Grupo borrado";
		} catch (Exception e) {
			return "Este grupo no se puede borrar";
		}
	}
}
