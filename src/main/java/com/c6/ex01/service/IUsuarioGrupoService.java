package com.c6.ex01.service;

import java.util.List;

import com.c6.ex01.dto.UsuarioGrupo;

public interface IUsuarioGrupoService {

	public List<UsuarioGrupo> listUsuarioGrupos(); // List all the UsuarioGrupos
	
	public UsuarioGrupo saveUsuarioGrupo(UsuarioGrupo usuarioGrupo); // Save a UsuarioGrupo
	
	public UsuarioGrupo usuarioGrupoXID(Long id); // List one UsuarioGrupo by id
	
	public void deleteUsuarioGrupo(Long id); // Delete UsuarioGrupo by id
}
