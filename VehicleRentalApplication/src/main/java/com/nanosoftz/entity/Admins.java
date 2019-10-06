package com.nanosoftz.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admins {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="admin_id")
	private int adminId;
	
	@Column(name="admin_name")
	private String adminName;
	
	@Column(name="admin_pass")
	private String adminPass;
	
	@OneToMany(mappedBy="admin", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List <Users> user;
	
	public List<Users> getUser() {
		return user;
	}

	public void setUser(List<Users> user) {
		this.user = user;
	}

	public Admins() {
	}

	public Admins(int adminId, String userAdmin, String passAdmin) {
		this.adminId = adminId;
		this.adminName = userAdmin;
		this.adminPass = passAdmin;
	}

	public int getAdminId() {
		return adminId;
	}

	public String getUserAdmin() {
		return adminName;
	}
	public void setUserAdmin(String userAdmin) {
		this.adminName = userAdmin;
	}
	public String getPassAdmin() {
		return adminPass;
	}
	public void setPassAdmin(String passAdmin) {
		this.adminPass = passAdmin;
	}
	@Override
	public String toString() {
		return "Admins [registration_no=" + adminId + ", userAdmin=" + adminName + ", passAdmin=" + adminPass
				+ "]";
	}
	
}
