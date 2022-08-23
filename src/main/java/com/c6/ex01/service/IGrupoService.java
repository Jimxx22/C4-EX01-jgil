package com.c6.ex01.service;

import java.util.List;

import com.c6.ex01.dto.Grupo;

public interface IGrupoService {
	
	public List<Grupo> listGrupos(); // List all the Grupos
	
	//public List<Grupo> listGruposByGame(Long id); // List all the Grupos
	
	public Grupo saveGrupo(Grupo grupo); // Save a Grupo
	
	public Grupo grupoXID(Long id); // List one Grupo by id
	
	public Grupo updateGrupo(Grupo grupo); // Update Grupo
	
	public void deleteGrupo(Long id); // Delete Grupo by id
}
