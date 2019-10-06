package com.nanosoftz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nanosoftz.entity.Guests;

@Repository
public interface GuestRepository extends JpaRepository<Guests, Long> {

}
