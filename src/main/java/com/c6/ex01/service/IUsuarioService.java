package com.c6.ex01.service;

import java.util.List;

import com.c6.ex01.dto.Usuario;


public interface IUsuarioService {

	public List<Usuario> listUsuarios(); // List all the Usuarios
	
	public Usuario saveUsuario(Usuario usuario); // Save a Usuario
	
	public Usuario usuarioXID(Long id); // List one Usuario by id
	
	public Usuario updateUsuario(Usuario usuario); // Update Usuario
	
	public void deleteUsuario(Long id); // Delete Usuario by id
}
