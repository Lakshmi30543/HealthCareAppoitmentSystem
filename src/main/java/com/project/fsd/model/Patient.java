package com.project.fsd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_table")
public class Patient {
	@Id
	@Column(name="pid")
	private int id;
	@Column(name="pname", length=50,nullable = true)
	private String name;
	@Column(name="pusername",length=50,nullable = true)
	private String username;
	@Column(name="ppassword",length=50,nullable=true)
	private String password;
	@Column(name="pphone",length=50,nullable=true)
	private String phone;
	@Column(name="padress",length=50,nullable= true)
	private String adress;
	@Column(name="pgender",length=50,nullable=true)
	private String gender;
	@Column(name="pdob",length=50,nullable=true)
	private String dob;
	@Column(name="page",length=50,nullable=true)
	private String age;
	@Column(name="phistory",length=50,nullable=true)
	private String history;
	@Column(name="pemergenccyphone",length=50,nullable=true)
	private String emergencyphone;
	@Column(name="pappointments",length=50,nullable=true)
	private String appointments;
	@Column(name="phealth",length=50,nullable=true)
	private String health;
	@Column(name="pinsurance",length=50,nullable=true)
	private String insurance;
	@Column(name="pdoctor",length=50,nullable=true)
	private String doctor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String dress) {
		this.adress = dress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getEmergencyphone() {
		return emergencyphone;
	}
	public void setEmergencyphone(String emergencyphone) {
		this.emergencyphone = emergencyphone;
	}
	public String getAppointments() {
		return appointments;
	}
	public void setAppointments(String appointments) {
		this.appointments = appointments;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
