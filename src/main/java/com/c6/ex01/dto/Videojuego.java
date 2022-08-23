package com.c6.ex01.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="videojuegos")
public class Videojuego {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany
	@JoinColumn(name="id_videojuego")
	private List<Grupo> grupos;

	/**
	 * 
	 */
	public Videojuego() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param grupos
	 */
	public Videojuego(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	 * @return the grupos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Grupo")
	public List<Grupo> getGrupos() {
		return grupos;
	}

	/**
	 * @param grupos the grupos to set
	 */
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", name=" + name + ", grupos=" + grupos + "]";
	}
	
}
