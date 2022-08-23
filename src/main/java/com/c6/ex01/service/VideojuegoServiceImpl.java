package com.c6.ex01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.c6.ex01.dao.IVideojuegoDAO;
import com.c6.ex01.dto.Videojuego;

public class VideojuegoServiceImpl implements IVideojuegoService{
	
	@Autowired
	IVideojuegoDAO iVideojuegoDAO;

	@Override
	public List<Videojuego> listVideojuegos() {
		// TODO Auto-generated method stub
		return iVideojuegoDAO.findAll();
	}

	@Override
	public Videojuego saveVideojuego(Videojuego videojuego) {
		// TODO Auto-generated method stub
		return iVideojuegoDAO.save(videojuego);
	}

	@Override
	public Videojuego videojuegoXID(Long id) {
		// TODO Auto-generated method stub
		return iVideojuegoDAO.findById(id).get();
	}

	@Override
	public Videojuego updateVideojuego(Videojuego videojuego) {
		// TODO Auto-generated method stub
		return iVideojuegoDAO.save(videojuego);
	}

	@Override
	public void deleteVideojuego(Long id) {
		// TODO Auto-generated method stub
		iVideojuegoDAO.deleteById(id);
	}

}
