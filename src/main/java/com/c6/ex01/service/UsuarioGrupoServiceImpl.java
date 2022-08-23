package com.c6.ex01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.c6.ex01.dao.IUsuarioGrupoDAO;
import com.c6.ex01.dto.UsuarioGrupo;

public class UsuarioGrupoServiceImpl implements IUsuarioGrupoService{
	
	@Autowired
	IUsuarioGrupoDAO iUsuarioGrupoDAO;

	@Override
	public List<UsuarioGrupo> listUsuarioGrupos() {
		// TODO Auto-generated method stub
		return iUsuarioGrupoDAO.findAll();
	}

	@Override
	public UsuarioGrupo saveUsuarioGrupo(UsuarioGrupo usuarioGrupo) {
		// TODO Auto-generated method stub
		return iUsuarioGrupoDAO.save(usuarioGrupo);
	}

	@Override
	public UsuarioGrupo usuarioGrupoXID(Long id) {
		// TODO Auto-generated method stub
		return iUsuarioGrupoDAO.findById(id).get();
	}

	@Override
	public UsuarioGrupo updateUsuarioGrupo(UsuarioGrupo usuarioGrupo) {
		// TODO Auto-generated method stub
		return iUsuarioGrupoDAO.save(usuarioGrupo);
	}

	@Override
	public void deleteUsuarioGrupo(Long id) {
		// TODO Auto-generated method stub
		iUsuarioGrupoDAO.deleteById(id);
	}

}
