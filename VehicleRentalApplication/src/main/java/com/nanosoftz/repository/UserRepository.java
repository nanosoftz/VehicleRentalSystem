package com.nanosoftz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanosoftz.entity.Users;

public interface UserRepository extends JpaRepository <Users, Integer> {

}
