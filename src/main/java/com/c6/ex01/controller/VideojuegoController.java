package com.c6.ex01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c6.ex01.dto.Videojuego;
import com.c6.ex01.service.VideojuegoServiceImpl;

@RestController
@RequestMapping("/api")
public class VideojuegoController {

	@Autowired
	VideojuegoServiceImpl videojuegoServiceImpl;
	
	@GetMapping("/grupos")
	public List<Videojuego> listVideojuegos(){	
		return videojuegoServiceImpl.listVideojuegos();	
	}
	
	@GetMapping("/grupos/{id}")
	public Videojuego VideojuegoXID(@PathVariable(name="id")Long id) {
		Videojuego videojuegoXID = new Videojuego();
		videojuegoXID=videojuegoServiceImpl.videojuegoXID(id);
		
		return videojuegoXID;
	}
}
