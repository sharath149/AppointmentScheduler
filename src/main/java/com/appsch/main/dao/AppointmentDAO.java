package com.appsch.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appsch.main.domain.Appointment;

@Repository
public interface AppointmentDAO extends JpaRepository<Appointment, Long> {
	
	List<Appointment> findAll();

}
