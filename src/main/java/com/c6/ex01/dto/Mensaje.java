package com.c6.ex01.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mensajes")
public class Mensaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="contenido")
	private String contenido;
	
	@Column(name="date_mensaje")
	private String date_mensaje;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario id_usuario;
	
	@ManyToOne
	@JoinColumn(name="id_grupo")
	private Videojuego id_grupo;

	/**
	 * 
	 */
	public Mensaje() {
		super();
	}

	/**
	 * @param id
	 * @param contenido
	 * @param date_mensaje
	 * @param id_usuario
	 * @param id_grupo
	 */
	public Mensaje(Long id, String contenido, Usuario id_usuario, Videojuego id_grupo) {
		this.id = id;
		this.contenido = contenido;
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
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
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
		return "Mensaje [id=" + id + ", contenido=" + contenido + ", date_mensaje=" + date_mensaje + ", id_usuario="
				+ id_usuario + ", id_grupo=" + id_grupo + "]";
	}	
}
