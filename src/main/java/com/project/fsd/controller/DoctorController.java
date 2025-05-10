package com.project.fsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.fsd.model.Book;
import com.project.fsd.model.Patient;
import com.project.fsd.model.Doctor;
import com.project.fsd.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/register")
    public String registerDoctor(@RequestBody Doctor doctor) {
        return doctorService.doctorRegistration(doctor);
    }

    @PostMapping("/login")
    public Doctor loginDoctor(@RequestParam String username, @RequestParam String password) {
        return doctorService.checkDoctorLogin(username, password);
    }

    @PutMapping("/update")
    public String updateDoctor(@RequestBody Doctor doctor) {
        return doctorService.updateDoctorProfile(doctor);
    }

    @GetMapping("/all")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{did}")
    public Doctor getDoctorById(@PathVariable int did) {
        return doctorService.getDoctorById(did);
    }

    @DeleteMapping("/{did}")
    public String deleteDoctorById(@PathVariable int did) {
        return doctorService.deleteDoctorById(did);
    }

    @GetMapping("/patients")
    public List<Patient> viewAllPatients() {
        return doctorService.viewAllPatients();
    }

    @GetMapping("/patient/{pid}")
    public Patient getPatientById(@PathVariable int pid) {
        return doctorService.getPatientById(pid);
    }

    @PostMapping("/appointment")
    public String bookAppointment(@RequestBody Book book) {
        return doctorService.bookAppointment(book);
    }

    @GetMapping("/appointments/{did}")
    public List<Book> getAppointmentsByDoctor(@PathVariable int did) {
        return doctorService.getAppointmentsByDoctor(did);
    }
}
