package com.c6.ex01.service;

import java.util.List;

import com.c6.ex01.dto.Mensaje;


public interface IMensajeService {
	
	public List<Mensaje> listMensajes(); // List all the Mensaje
	
	public Mensaje saveMensaje(Mensaje mensaje); // Save a Mensaje
	
//	public List<Mensaje> findByIdGroup(Long id); // List all the Mensaje
	
	public Mensaje mensajeXID(Long id); // List one Mensaje by id
	
	public Mensaje updateMensaje(Mensaje mensaje); // Update Mensaje
	
	public void deleteMensaje(Long id); // Delete Mensaje by id

}
