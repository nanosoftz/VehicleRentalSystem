package com.nanosoftz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Guests {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Emirate Id", unique=true)
	private long guestEmirateId;
	
	@Column(name="Email")
	@Email
	@NotNull(message="Email must be filled")
	private String email;
	
	@Column(name="Username")
	@NotEmpty
	private String username;
	
	@Column(name="Password")
	@NotEmpty
	@Size(min=6, message="password must not be less than 6")
	private String password;
	
	@OneToOne(mappedBy="guest")
	private CarTypes cartype;
	
	@OneToOne(mappedBy="guest")
	private CarStatus carstatus;

	public Long getGuestEmirateId() {
		return guestEmirateId;
	}

	public void setGuestEmirateId(Long guestEmirateId) {
		this.guestEmirateId = guestEmirateId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public CarTypes getCartype() {
		return cartype;
	}

	public void setCartype(CarTypes cartype) {
		this.cartype = cartype;
	}

	public CarStatus getCarstatus() {
		return carstatus;
	}

	public void setCarstatus(CarStatus carstatus) {
		this.carstatus = carstatus;
	}

	public void setGuestEmirateId(long guestEmirateId) {
		this.guestEmirateId = guestEmirateId;
	}  
	
	
}
