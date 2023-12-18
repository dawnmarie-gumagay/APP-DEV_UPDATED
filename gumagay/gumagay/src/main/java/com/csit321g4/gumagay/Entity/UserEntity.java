package com.csit321g4.gumagay.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbluser")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private int sid;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "is_deleted")
	private boolean isDeleted = false;
	
	private boolean isAdmin;

	public UserEntity() {
		super();
	}

	public UserEntity(int sid, String username, String password, String email,
			boolean isDeleted, boolean isAdmin) {
		super();
		this.sid = sid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.isDeleted = isDeleted;
		this.isAdmin = isAdmin;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getisDeleted() {
		return isDeleted;
	}

	public void setisDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	

}
