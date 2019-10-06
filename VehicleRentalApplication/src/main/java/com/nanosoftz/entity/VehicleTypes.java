package com.nanosoftz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class VehicleTypes {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private long id;
	
	@Column(name="MercedesType")
	private String[] mercedes;
	
	@Column(name="ToyotaType")
	private String[] toyota;
	
	@Column(name="ChevroletType")
	private String[] chevrolet;
	
	@Column(name="LexusType")
	private String[] lexus;
	
	@Column(name="MazdaType")
	private String[] mazda;
	
	@Column(name="MitsubushiType")
	private String[] mitsubushi;
	
	@ManyToOne
	@JoinColumn(name="Admin_Email")
	private Admins admin;
	
	@OneToOne
	private Guests guest;
	
	@ManyToOne
	@JoinColumn(name="User_Email")
	private Users user;
	
	@OneToOne
	private VehicleStatus carstatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String[] getMercedes() {
		return mercedes;
	}

	public void setMercedes(String[] mercedes) {
		this.mercedes = mercedes;
	}

	public String[] getToyota() {
		return toyota;
	}

	public void setToyota(String[] toyota) {
		this.toyota = toyota;
	}

	public String[] getChevrolet() {
		return chevrolet;
	}

	public void setChevrolet(String[] chevrolet) {
		this.chevrolet = chevrolet;
	}

	public String[] getLexus() {
		return lexus;
	}

	public void setLexus(String[] lexus) {
		this.lexus = lexus;
	}

	public String[] getMazda() {
		return mazda;
	}

	public void setMazda(String[] mazda) {
		this.mazda = mazda;
	}

	public String[] getMitsubushi() {
		return mitsubushi;
	}

	public void setMitsubushi(String[] mitsubushi) {
		this.mitsubushi = mitsubushi;
	}

	public Admins getAdmin() {
		return admin;
	}

	public void setAdmin(Admins admin) {
		this.admin = admin;
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

	public VehicleStatus getCarstatus() {
		return carstatus;
	}

	public void setCarstatus(VehicleStatus carstatus) {
		this.carstatus = carstatus;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
