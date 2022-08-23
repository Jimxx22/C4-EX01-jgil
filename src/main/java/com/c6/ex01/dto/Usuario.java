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
@Table(name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="role")
	private String role;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@OneToMany
	@JoinColumn(name="id_usuario_admin")
	private List<Grupo> grupos;
	
	@OneToMany
	@JoinColumn(name="id_usuario")
	private List<Mensaje> mensajes;
	
	@OneToMany
	@JoinColumn(name="id_usuario")
	private List<UsuarioGrupo> usuario_grupos;


	public Usuario() {
	}

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param email
	 * @param role
	 * @param first_name
	 * @param last_name
	 * @param grupos
	 * @param mensajes
	 * @param usuario_grupos
	 */
	public Usuario(Long id, String username, String password, String email, String role, String first_name,
			String last_name) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		this.first_name = first_name;
		this.last_name = last_name;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	 * @return the usuario_grupos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "UsuarioGrupo")
	public List<UsuarioGrupo> getUsuario_grupos() {
		return usuario_grupos;
	}

	/**
	 * @param usuario_grupos the usuario_grupos to set
	 */
	public void setUsuario_grupos(List<UsuarioGrupo> usuario_grupos) {
		this.usuario_grupos = usuario_grupos;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", role=" + role + ", first_name=" + first_name + ", last_name=" + last_name + ", grupos=" + grupos
				+ ", mensajes=" + mensajes + ", usuario_grupos=" + usuario_grupos + "]";
	}
	
}
