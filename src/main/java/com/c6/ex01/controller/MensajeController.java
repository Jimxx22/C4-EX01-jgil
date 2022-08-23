package com.c6.ex01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c6.ex01.dto.Mensaje;
import com.c6.ex01.service.MensajeServiceImpl;

@RestController
@RequestMapping("/api")
public class MensajeController {

	@Autowired
	MensajeServiceImpl mensajeServiceImpl;
	
	@GetMapping("/mensajes")
	public List<Mensaje> listMensajes(){	
		return mensajeServiceImpl.listMensajes();	
	}
	
	@PostMapping("/mensajes")
	public Mensaje saveMensaje(@RequestBody Mensaje mensaje) {
		return mensajeServiceImpl.saveMensaje(mensaje);
	}
	
	@GetMapping("/mensajes/id_grupo/id/{id}")
	public List<Mensaje> listMensajesGrupo(@PathVariable(name="id")Long id){	
		return mensajeServiceImpl.listByGroup(id);	
	}
	
	@GetMapping("/mensajes/{id}")
	public Mensaje MensajeXID(@PathVariable(name="id")Long id) {
		Mensaje mensajeXID = new Mensaje();
		mensajeXID=mensajeServiceImpl.mensajeXID(id);
		
		return mensajeXID;
	}
	
	@PutMapping("/mensajes/{id}")
	public Mensaje updateMensaje(@PathVariable(name="id")Long id, @RequestBody Mensaje mensaje) {
		Mensaje mensajeSel = new Mensaje();
		Mensaje mensajeAct = new Mensaje();
		
		mensajeSel=mensajeServiceImpl.mensajeXID(id);
		
		mensajeSel.setContenido(mensaje.getContenido());
		
		mensajeAct=mensajeServiceImpl.updateMensaje(mensajeSel);
		
		return mensajeAct;
	}
	
	@DeleteMapping("/mensajes/{id}")
	public String deleteMensaje(@PathVariable(name="id")Long id) {
		try {
			mensajeServiceImpl.deleteMensaje(id);
			return "Mensaje borrado";
		} catch (Exception e) {
			return "Este Mensaje no se puede borrar";
		}
	}
}
