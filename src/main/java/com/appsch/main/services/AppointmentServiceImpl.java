package com.appsch.main.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsch.main.dao.AppointmentDAO;
import com.appsch.main.domain.Appointment;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentDAO appointmentDAO;
	
	@Override
	public Appointment getAppointmentById(Long id) {
		return appointmentDAO.findOne(id);
	}

	@Override
	public List<Appointment> getAllAppointments() {
		return appointmentDAO.findAll();
	}

	@Override
	public Appointment createAppointment(Appointment appointment) {
		return appointmentDAO.save(appointment);
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		return appointmentDAO.save(appointment);
	}

	@Override
	public void deleteAppointment(Long id) {
		appointmentDAO.delete(id);
	}
	
}

