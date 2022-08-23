package com.c6.ex01.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c6.ex01.dto.Usuario;
import com.c6.ex01.service.UsuarioServiceImpl;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
	
	@PostMapping("/usuarios")
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImpl.saveUsuario(usuario);
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuario UsuarioXID(@PathVariable(name="id")Long id) {
		Usuario usuarioXID = new Usuario();
		usuarioXID=usuarioServiceImpl.usuarioXID(id);
		
		return usuarioXID;
	}
	
	@PutMapping("/usuarios/{id}")
	public Usuario updateUsuario(@PathVariable(name="id")Long id, @RequestBody Usuario usuario) {
		Usuario usuarioSel = new Usuario();
		Usuario usuarioAct = new Usuario();
		
		usuarioSel=usuarioServiceImpl.usuarioXID(id);
		
		usuarioSel.setUsername(usuario.getUsername());
		usuarioSel.setPassword(usuario.getPassword());
		usuarioSel.setEmail(usuario.getEmail());
		usuarioSel.setRole(usuario.getRole());
		usuarioSel.setFirst_name(usuario.getFirst_name());
		usuarioSel.setLast_name(usuario.getLast_name());
		
		usuarioAct=usuarioServiceImpl.updateUsuario(usuarioSel);
		
		return usuarioAct;
	}
}
