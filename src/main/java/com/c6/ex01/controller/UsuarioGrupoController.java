package com.c6.ex01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c6.ex01.dto.UsuarioGrupo;
import com.c6.ex01.service.UsuarioGrupoServiceImpl;
@RestController
@RequestMapping("/api")
public class UsuarioGrupoController {

	@Autowired
	UsuarioGrupoServiceImpl usuarioGrupoServiceImpl;
	
	public List<UsuarioGrupo> listUsuarioGrupos(){	
		return usuarioGrupoServiceImpl.listUsuarioGrupos();	
	}
	
	public UsuarioGrupo saveUsuarioGrupo(@RequestBody UsuarioGrupo usuarioGrupo) {
		return usuarioGrupoServiceImpl.saveUsuarioGrupo(usuarioGrupo);
	}
	
	public UsuarioGrupo UsuarioGrupoXID(@PathVariable(name="id")Long id) {
		UsuarioGrupo usuarioGrupoXID = new UsuarioGrupo();
		usuarioGrupoXID=usuarioGrupoServiceImpl.usuarioGrupoXID(id);
		
		return usuarioGrupoXID;
	}
	
	public String deleteUsuarioGrupo(@PathVariable(name="id")Long id) {
		try {
			usuarioGrupoServiceImpl.deleteUsuarioGrupo(id);
			return "UsuarioGrupo borrado";
		} catch (Exception e) {
			return "Este UsuarioGrupo no se puede borrar";
		}
	}
}
