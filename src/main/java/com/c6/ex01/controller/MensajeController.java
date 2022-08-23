package com.c6.ex01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	public List<Mensaje> listMensajes(){	
		return mensajeServiceImpl.listMensajes();	
	}
	
	public Mensaje saveMensaje(@RequestBody Mensaje mensaje) {
		return mensajeServiceImpl.saveMensaje(mensaje);
	}
	
	public Mensaje MensajeXID(@PathVariable(name="id")Long id) {
		Mensaje mensajeXID = new Mensaje();
		mensajeXID=mensajeServiceImpl.mensajeXID(id);
		
		return mensajeXID;
	}
	
	public Mensaje updateMensaje(@PathVariable(name="id")Long id, @RequestBody Mensaje mensaje) {
		Mensaje mensajeSel = new Mensaje();
		Mensaje mensajeAct = new Mensaje();
		
		mensajeSel=mensajeServiceImpl.mensajeXID(id);
		
		mensajeSel.setContenido(mensaje.getContenido());
		mensajeSel.setDate_mensaje();
		
		mensajeAct=mensajeServiceImpl.updateMensaje(mensajeSel);
		
		return mensajeAct;
	}
	
	public String deleteMensaje(@PathVariable(name="id")Long id) {
		try {
			mensajeServiceImpl.deleteMensaje(id);
			return "Mensaje borrado";
		} catch (Exception e) {
			return "Este Mensaje no se puede borrar";
		}
	}
}
