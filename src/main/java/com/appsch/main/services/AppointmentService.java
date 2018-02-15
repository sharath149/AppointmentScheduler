package com.appsch.main.services;

import java.util.List;


import com.appsch.main.domain.Appointment;

public interface AppointmentService {
	
	Appointment getAppointmentById(Long id);
	
	List<Appointment> getAllAppointments();
	
	Appointment createAppointment(Appointment appointment);
	
	Appointment updateAppointment(Appointment appointment);
	
	void deleteAppointment(Long id);

}
