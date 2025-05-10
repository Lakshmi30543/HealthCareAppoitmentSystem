package com.project.fsd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctors_table")
public class Doctor {
	@Id
	@Column(name="did")
	private int id;
	@Column(name="dname", length=50,nullable = true)
	private String name;
	@Column(name="dusername", length=50,nullable = true)
	private String username;
	@Column(name="demail", length=50,nullable = true)
	private String email;
	@Column(name="dpassword",length=50,nullable=true)
	private String password;
	@Column(name="dphone", length=50,nullable = true)
	private String phone;
	@Column(name="dspeciality", length=50,nullable = true)
	private String speciality;
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
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
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
