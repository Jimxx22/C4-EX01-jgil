package com.c6.ex01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/usuariosGrupos")
	public List<UsuarioGrupo> listUsuarioGrupos(){	
		return usuarioGrupoServiceImpl.listUsuarioGrupos();	
	}
	
	@PostMapping("/usuariosGrupos")
	public UsuarioGrupo saveUsuarioGrupo(@RequestBody UsuarioGrupo usuarioGrupo) {
		return usuarioGrupoServiceImpl.saveUsuarioGrupo(usuarioGrupo);
	}
	
	@GetMapping("/usuariosGrupos/{id}")
	public UsuarioGrupo UsuarioGrupoXID(@PathVariable(name="id")Long id) {
		UsuarioGrupo usuarioGrupoXID = new UsuarioGrupo();
		usuarioGrupoXID=usuarioGrupoServiceImpl.usuarioGrupoXID(id);
		
		return usuarioGrupoXID;
	}
	
	@DeleteMapping("/usuariosGrupos/{id}")
	public String deleteUsuarioGrupo(@PathVariable(name="id")Long id) {
		try {
			usuarioGrupoServiceImpl.deleteUsuarioGrupo(id);
			return "UsuarioGrupo borrado";
		} catch (Exception e) {
			return "Este UsuarioGrupo no se puede borrar";
		}
	}
}
