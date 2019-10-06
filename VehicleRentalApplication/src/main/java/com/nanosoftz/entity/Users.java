package com.nanosoftz.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	int userId;
	@Column(name="user_name")
	String userName;
	@Column(name="user_pass")
	String userPass;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="useradmin_id")
	Admins admin;
	
	public Admins getAdmin() {
		return admin;
	}
	public void setAdmin(Admins admin) {
		this.admin = admin;
	}
	public int userId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String userName) {
		this.userName = userName;
	}
	public String getPassUser() {
		return userPass;
	}
	public void setPassUser(String userPass) {
		this.userPass = userPass;
	}
	@Override
	public String toString() {
		return "Users [registration_no=" + userId + ", username=" + userName + ", passUser=" + userPass + "]";
	}
	

}
