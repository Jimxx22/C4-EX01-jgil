package com.c6.ex01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.c6.ex01.dao.IUsuarioDAO;
import com.c6.ex01.dto.Usuario;

public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	IUsuarioDAO iUsuarioDAO;

	@Override
	public List<Usuario> listUsuarios() {
		// TODO Auto-generated method stub
		return iUsuarioDAO.findAll();
	}

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

	@Override
	public void deleteUsuario(Long id) {
		// TODO Auto-generated method stub
		iUsuarioDAO.deleteById(id);
	}

}
