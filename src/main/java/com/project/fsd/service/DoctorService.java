package com.project.fsd.service;

import java.util.List;

import com.project.fsd.model.Book;
import com.project.fsd.model.Doctor;
import com.project.fsd.model.Patient;

public interface DoctorService 
{
    public String doctorRegistration(Doctor doctor);
    public Doctor checkDoctorLogin(String username, String password);
    
    public String updateDoctorProfile(Doctor doctor);
    public List<Doctor> getAllDoctors();
    
    public Doctor getDoctorById(int did);
    public String deleteDoctorById(int did);
    
    public List<Patient> viewAllPatients();
    public Patient getPatientById(int patientId);
    
    public String bookAppointment(Book book);
    public List<Book> getAppointmentsByDoctor(int did);
	Doctor getDoctorById(String did);
	Doctor getDoctorById1(int did);
}
