package com.c6.ex01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.ex01.dao.IVideojuegoDAO;
import com.c6.ex01.dto.Videojuego;

@Service
public class VideojuegoServiceImpl implements IVideojuegoService{
	
	@Autowired
	IVideojuegoDAO iVideojuegoDAO;

	@Override
	public List<Videojuego> listVideojuegos() {
		// TODO Auto-generated method stub
		return iVideojuegoDAO.findAll();
	}

	@Override
	public Videojuego videojuegoXID(Long id) {
		// TODO Auto-generated method stub
		return iVideojuegoDAO.findById(id).get();
	}

	@Override
	public void deleteVideojuego(Long id) {
		// TODO Auto-generated method stub
		iVideojuegoDAO.deleteById(id);
	}

	@Override
	public Videojuego listByName(String nom) {
		// TODO Auto-generated method stub
		return iVideojuegoDAO.findByName(nom);
	}

}
