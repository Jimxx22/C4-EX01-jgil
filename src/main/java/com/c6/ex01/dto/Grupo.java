package com.c6.ex01.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="grupos")
public class Grupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="id_usuario_admin")
	private Usuario id_usuario_admin;
	
	@ManyToOne
	@JoinColumn(name="id_videojuego")
	private Videojuego id_videojuego;
	
	@OneToMany
	@JoinColumn(name="id_grupo")
	private List<Mensaje> mensajes;
	
	@OneToMany
	@JoinColumn(name="id_grupo")
	private List<UsuarioGrupo> usuarioGrupos;

	/**
	 * 
	 */
	public Grupo() {
	}

	/**
	 * @param id
	 * @param name
	 * @param id_usuario_admin
	 * @param id_videojuego
	 */
	public Grupo(Long id, String name, Usuario id_usuario_admin, Videojuego id_videojuego) {
		this.id = id;
		this.name = name;
		this.id_usuario_admin = id_usuario_admin;
		this.id_videojuego = id_videojuego;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id_usuario_admin
	 */
	public Usuario getId_usuario_admin() {
		return id_usuario_admin;
	}

	/**
	 * @param id_usuario_admin the id_usuario_admin to set
	 */
	public void setId_usuario_admin(Usuario id_usuario_admin) {
		this.id_usuario_admin = id_usuario_admin;
	}

	/**
	 * @return the id_videojuego
	 */
	public Videojuego getId_videojuego() {
		return id_videojuego;
	}

	/**
	 * @param id_videojuego the id_videojuego to set
	 */
	public void setId_videojuego(Videojuego id_videojuego) {
		this.id_videojuego = id_videojuego;
	}

	/**
	 * @return the mensajes
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Mensaje")
	public List<Mensaje> getMensajes() {
		return mensajes;
	}

	/**
	 * @param mensajes the mensajes to set
	 */
	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	/**
	 * @return the usuarioGrupos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "UsuarioGrupo")
	public List<UsuarioGrupo> getUsuarioGrupos() {
		return usuarioGrupos;
	}

	/**
	 * @param usuarioGrupos the usuarioGrupos to set
	 */
	public void setUsuarioGrupos(List<UsuarioGrupo> usuarioGrupos) {
		this.usuarioGrupos = usuarioGrupos;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", name=" + name + ", id_usuario_admin=" + id_usuario_admin + ", id_videojuego="
				+ id_videojuego + "]";
	}
}
