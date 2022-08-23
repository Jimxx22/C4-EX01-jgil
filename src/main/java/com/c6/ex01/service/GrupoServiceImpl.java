package com.c6.ex01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.ex01.dao.IGrupoDAO;
import com.c6.ex01.dto.Grupo;

@Service
public class GrupoServiceImpl implements IGrupoService{

	@Autowired
	IGrupoDAO iGrupoDAO;
	
	@Override
	public List<Grupo> listGrupos() {
		// TODO Auto-generated method stub
		return iGrupoDAO.findAll();
	}

	@Override
	public Grupo saveGrupo(Grupo grupo) {
		// TODO Auto-generated method stub
		return iGrupoDAO.save(grupo);
	}

	@Override
	public Grupo grupoXID(Long id) {
		// TODO Auto-generated method stub
		return iGrupoDAO.findById(id).get();
	}

	@Override
	public Grupo updateGrupo(Grupo grupo) {
		// TODO Auto-generated method stub
		return iGrupoDAO.save(grupo);
	}

	@Override
	public void deleteGrupo(Long id) {
		// TODO Auto-generated method stub
		iGrupoDAO.deleteById(id);
	}

}
