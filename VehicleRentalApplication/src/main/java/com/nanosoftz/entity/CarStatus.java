package com.nanosoftz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CarStatus {

	@Id
	@Column(name="Status")
	private boolean status;
	
	@OneToOne
	private CarTypes cartype;
	
	@OneToOne
	private Guests guest;
	
	@OneToOne
	private Users user;
	
	@ManyToOne
	@JoinColumn(name="Admin_Email")
	private Admin admin;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public CarTypes getCartype() {
		return cartype;
	}

	public void setCartype(CarTypes cartype) {
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

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
}
