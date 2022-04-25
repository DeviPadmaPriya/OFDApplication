package com.training.OnlineFoodDeliveryApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String username;
	
	private String password;

	public User() {
		
	}

	public User(String username, String password) {
	
		this.username = username;
		this.password = password;
	}

	public int getUser_id() {
		return id;
	}

	public void setUser_id(int user_id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String user_name) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String user_pwd) {
		this.password = password;
	}
	
	

}
