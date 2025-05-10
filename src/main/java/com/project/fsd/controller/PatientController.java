package com.project.fsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.fsd.model.Book;
import com.project.fsd.model.Doctor;
import com.project.fsd.model.Patient;
import com.project.fsd.service.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin("*")
public class PatientController {

    @Autowired
    private PatientService patientService;

    // Register a new patient
    @PostMapping("/register")
    public String registerPatient(@RequestBody Patient patient) {
        return patientService.patientRegistration(patient);
    }

    // Patient login
    @PostMapping("/login")
    public Patient loginPatient(@RequestParam String username, @RequestParam String password) {
        return patientService.checkPatientLogin(username, password);
    }

    // Update patient profile
    @PutMapping("/update")
    public String updatePatient(@RequestBody Patient patient) {
        return patientService.updatePatientProfile(patient);
    }

    // Get all patients
    @GetMapping("/all")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    // Get a patient by ID
    @GetMapping("/{pid}")
    public Patient getPatientById(@PathVariable int pid) {
        return patientService.getPatientById(pid);
    }

    // Delete a patient by ID
    @DeleteMapping("/{pid}")
    public Patient deletePatientById(@PathVariable int pid) {
        return patientService.getPatientById(pid);
    }

    // View all available doctors
    @GetMapping("/doctors")
    public List<Doctor> viewAllDoctors() {
        return patientService.viewAllDoctors();
    }

    // View specific doctor details
    @GetMapping("/doctor/{doctorId}")
    public Doctor getDoctorById(@PathVariable int doctorId) {
        return patientService.getDoctorById(doctorId);
    }

    // Book an appointment
    @PostMapping("/book")
    public String bookAppointment(@RequestBody Book book) {
        return patientService.bookAppointment(book);
    }

    // Get booked appointments by patient ID
    @GetMapping("/bookings/{pid}")
    public List<Book> getAppointmentsByPatient(@PathVariable int pid) {
        return patientService.getAppointmentsByPatient(pid);
    }
}
