package com.example.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	@GeneratedValue
	private int role_id;
	
	private String role_name;

	
	public Role() {
		super();
	}

	public int getId() {
		return role_id;
	}

	public void setId(int role_id) {
		this.role_id = role_id;
	}

	public String getRole() {
		return role_name;
	}

	public void setRole(String role_name) {
		this.role_name = role_name;
	}
	
}
