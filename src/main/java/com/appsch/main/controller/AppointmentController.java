package com.appsch.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.appsch.main.domain.Appointment;
import com.appsch.main.services.AppointmentService;
import com.appsch.main.services.UserService;


@RestController
@RequestMapping("/api/appointment")
@CrossOrigin
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@Autowired
	UserService userService;
	
	public ResponseEntity<Appointment> getAppointmentById(@PathVariable final Long id){
		Appointment appointment = appointmentService.getAppointmentById(id);
		return new ResponseEntity<Appointment>(appointment, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Appointment>> getAllAppointments(){
		List<Appointment> appointment = appointmentService.getAllAppointments();
		return new ResponseEntity<List<Appointment>>(appointment, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Appointment> createAppointment(@RequestBody final Appointment appointment){
		Appointment appointmentCreate = appointmentService.createAppointment(appointment);
		return new ResponseEntity<Appointment>(appointmentCreate, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Appointment> updateAppointment(@PathVariable final Long id, @RequestBody final Appointment appointment){
		Appointment appointmentUpdate = appointmentService.updateAppointment(appointment);
		return new ResponseEntity<Appointment>(appointmentUpdate, HttpStatus.OK);
	}



	
}
