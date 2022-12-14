package com.c6.ex01.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.ex01.dao.IUsuarioDAO;
import com.c6.ex01.dto.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	IUsuarioDAO iUsuarioDAO;

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public Usuario usuarioXID(Long id) {
		// TODO Auto-generated method stub
		return iUsuarioDAO.findById(id).get();
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return iUsuarioDAO.save(usuario);
	}

}
