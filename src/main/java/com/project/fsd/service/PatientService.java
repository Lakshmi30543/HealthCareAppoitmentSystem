package com.project.fsd.service;

import java.util.List;

import com.project.fsd.model.Book;
import com.project.fsd.model.Doctor;
import com.project.fsd.model.Patient;

public interface PatientService {

    // Patient login
    public Patient checkPatientLogin(String username, String password);

    // View all doctors
    public List<Doctor> viewAllDoctors();

    // Get patient by ID
    public Patient getPatientById(int patientId);

    // Get all appointments for a patient
    public List<Book> getAppointmentsByPatient(int patientId);

    // Update appointment status (optional, if needed)
    public String updateAppointmentStatus(int appointmentId, String status);

    // Book a new appointment
    public String bookAppointment(Book book);

	public String patientRegistration(Patient patient);

	public String updatePatientProfile(Patient patient);

	public Doctor getDoctorById(int doctorId);

	public List<Patient> getAllPatients();
}
