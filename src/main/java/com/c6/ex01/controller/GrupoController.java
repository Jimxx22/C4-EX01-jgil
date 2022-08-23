package com.c6.ex01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c6.ex01.dto.Grupo;
import com.c6.ex01.service.GrupoServiceImpl;

@RestController
@RequestMapping("/api")
public class GrupoController {

	@Autowired
	GrupoServiceImpl grupoServiceImpl;
	
	public List<Grupo> listGrupos(){	
		return grupoServiceImpl.listGrupos();	
	}
	
	public Grupo saveGrupo(@RequestBody Grupo grupo) {
		return grupoServiceImpl.saveGrupo(grupo);
	}
	
	public Grupo grupoXID(@PathVariable(name="id")Long id) {
		Grupo grupoXID = new Grupo();
		grupoXID=grupoServiceImpl.grupoXID(id);
		
		return grupoXID;
	}
	
	public Grupo updateGrupo(@PathVariable(name="id")Long id, @RequestBody Grupo grupo) {
		Grupo grupoSel = new Grupo();
		Grupo grupoAct = new Grupo();
		
		grupoSel=grupoServiceImpl.grupoXID(id);
		
		grupoSel.setName(grupo.getName());
		grupoSel.setId_usuario_admin(grupo.getId_usuario_admin());
		grupoSel.setId_videojuego(grupo.getId_videojuego());
		
		grupoAct=grupoServiceImpl.updateGrupo(grupoSel);
		
		return grupoAct;
	}
	
	public String deleteGrupo(@PathVariable(name="id")Long id) {
		try {
			grupoServiceImpl.deleteGrupo(id);
			return "Grupo borrado";
		} catch (Exception e) {
			return "Este grupo no se puede borrar";
		}
	}
}
