package com.nanosoftz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nanosoftz.entity.Admins;
import com.nanosoftz.repository.AdminRepository;

@RestController
@RequestMapping("/api")
public class AdminController {

	@Autowired
	AdminRepository adminRepo;
	
	@GetMapping("/read")
	public String getString() {
		return "This is my first Angular Spring Boot App.";
	}
	
	@GetMapping("/admins")
	public List<Admins> getAllAdmin(){
		List<Admins> admin = new ArrayList<Admins>();
		adminRepo.findAll().forEach(admin::add);
		return admin;
		
	} 	
	
	@GetMapping("/admins/{id}")
	public ResponseEntity<Optional<Admins>> getAdminById (@PathVariable(value="id") Integer id){
		Optional<Admins> admin = adminRepo.findById(id);
		if(admin==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(admin);			
		
	}
	
	@PostMapping("/details")
		public List<Admins> createAdmin(@Valid @RequestBody Admins ad){
			return (List<Admins>) adminRepo.save(ad);
		}
	
	@PostMapping("/create")
	public List <Admins> postAdmin(@Valid @RequestBody Admins ad) {	
		List<Admins> a = new ArrayList<>();
		adminRepo.save(new Admins(ad.getAdminId(), ad.getUserAdmin(), ad.getPassAdmin()));
		return a;
	}
}
