package com.appsch.main.domain;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USERS_ID")
	private Long id;
	private String userName;
	private String password;
	private String fName;
	private String lName;
	private Long phone;
	private String email;
	private String description;
	
	@OneToOne(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
	@LazyCollection(LazyCollectionOption.TRUE)
	private Appointment appointment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", password=" + password + ", fName=" + fName + ", lName="
				+ lName + ", phone=" + phone + ", email=" + email + ", description=" + description + ", appointment="
				+ appointment + "]";
	}

	public Users(String userName, String password, String fName, String lName, Long phone, String email,
			String description, Appointment appointment) {
		super();
		this.userName = userName;
		this.password = password;
		this.fName = fName;
		this.lName = lName;
		this.phone = phone;
		this.email = email;
		this.description = description;
		this.appointment = appointment;
	}

	public Users() {
		
	}	
}
