package com.leoabrantes.dscatalog.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.leoabrantes.dscatalog.entitties.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String email;
	private String firstName;
	private String lastName;
	
	Set<RoleDTO> roles = new HashSet<>();
	
	
	public UserDTO() {
		
	}

	public UserDTO(Long id, String email, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		email = entity.getEmail();
		firstName = entity.getFirstName();
		lastName = entity.getLastName();
		entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}
	

}
