package com.nanosoftz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanosoftz.entity.Admins;

public interface AdminRepository extends JpaRepository <Admins, Integer> {
	
	<Optional>Admins findById(int id);

}
  