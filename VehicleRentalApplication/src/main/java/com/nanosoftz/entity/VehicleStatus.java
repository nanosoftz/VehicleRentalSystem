package com.nanosoftz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class VehicleStatus {

	@Id
	@Column(name="Status")
	private boolean status;
	
	@OneToOne
	private VehicleTypes cartype;
	
	@OneToOne
	private Guests guest;
	
	@OneToOne
	private Users user;
	
	@ManyToOne
	@JoinColumn(name="Admin_Email")
	private Admins admin;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public VehicleTypes getCartype() {
		return cartype;
	}

	public void setCartype(VehicleTypes cartype) {
		this.cartype = cartype;
	}

	public Guests getGuest() {
		return guest;
	}

	public void setGuest(Guests guest) {
		this.guest = guest;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Admins getAdmin() {
		return admin;
	}

	public void setAdmin(Admins admin) {
		this.admin = admin;
	}
	
	
}
