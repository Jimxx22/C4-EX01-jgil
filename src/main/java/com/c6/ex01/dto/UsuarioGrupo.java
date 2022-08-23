package com.c6.ex01.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarios_grupos")
public class UsuarioGrupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario id_usuario;
	
	@ManyToOne
	@JoinColumn(name="id_grupo")
	private Videojuego id_grupo;

	/**
	 * 
	 */
	public UsuarioGrupo() {
	}

	/**
	 * @param id
	 * @param id_usuario
	 * @param id_grupo
	 */
	public UsuarioGrupo(Long id, Usuario id_usuario, Videojuego id_grupo) {
		this.id = id;
		this.id_usuario = id_usuario;
		this.id_grupo = id_grupo;
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
	 * @return the id_usuario
	 */
	public Usuario getId_usuario() {
		return id_usuario;
	}

	/**
	 * @param id_usuario the id_usuario to set
	 */
	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}

	/**
	 * @return the id_grupo
	 */
	public Videojuego getId_grupo() {
		return id_grupo;
	}

	/**
	 * @param id_grupo the id_grupo to set
	 */
	public void setId_grupo(Videojuego id_grupo) {
		this.id_grupo = id_grupo;
	}

	@Override
	public String toString() {
		return "UsuarioGrupo [id=" + id + ", id_usuario=" + id_usuario + ", id_grupo=" + id_grupo + "]";
	}
}
