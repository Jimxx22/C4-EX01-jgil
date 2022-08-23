package com.c6.ex01.service;


import com.c6.ex01.dto.Usuario;


public interface IUsuarioService {
	
	public Usuario saveUsuario(Usuario usuario); // Save a Usuario
	
	public Usuario usuarioXID(Long id); // List one Usuario by id
	
	public Usuario updateUsuario(Usuario usuario); // Update Usuario

}
