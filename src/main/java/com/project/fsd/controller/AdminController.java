package com.project.fsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.fsd.model.Admin;
import com.project.fsd.model.Doctor;
import com.project.fsd.model.Patient;
import com.project.fsd.service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController 
{
    @Autowired
    private AdminService adminService;

    @PostMapping("/checkadminlogin")
    public ResponseEntity<?> checkAdminLogin(@RequestBody Admin admin) {
        try {
            Admin a = adminService.checkadminlogin(admin.getUsername(), admin.getPassword());
            if (a != null) {
                return ResponseEntity.ok(a);
            } else {
                return ResponseEntity.status(401).body("Invalid Username or Password");
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Login failed: " + e.getMessage());
        }
    }

    // View all doctors
    @GetMapping("/viewalldoctors")
    public ResponseEntity<List<Doctor>> viewAllDoctors() {
        List<Doctor> doctors = adminService.displaydoctors();
        return ResponseEntity.ok(doctors);
    }

    // Add patient
    @PostMapping("/addpatient")
    public ResponseEntity<String> addPatient(@RequestBody Patient patient) {
        try {
            String output = adminService.addPatient(patient);
            return ResponseEntity.ok(output);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to Add Patient ... !!");
        }
    }

    // View all patients
    @GetMapping("/viewallpatients")
    public ResponseEntity<List<Patient>> viewAllPatients() {
        List<Patient> patientList = adminService.displaypatient();
        return ResponseEntity.ok(patientList);
    }

    // Delete doctor
    @DeleteMapping("/deletedoctor")
    public ResponseEntity<String> deleteDoctor(@RequestParam int did) {
        try {
            String output = adminService.deleteDoctor(did);
            return ResponseEntity.ok(output);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to Delete Doctor ... !!");
        }
    }

    // Delete patient
    @DeleteMapping("/deletepatient")
    public ResponseEntity<String> deletePatient(@RequestParam int pid) {
        try {
            String output = adminService.deletePatient(pid);
            return ResponseEntity.ok(output);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to Delete Patient ... !!");
        }
    }

    // Get doctor count
    @GetMapping("/doctorcount")
    public ResponseEntity<Long> getDoctorCount() {
        long count = adminService.displaydoctorcount();
        return ResponseEntity.ok(count);
    }

    // Get patient count
    @GetMapping("/patientcount")
    public ResponseEntity<Long> getPatientCount() {
        long count = adminService.displaypatientcount();
        return ResponseEntity.ok(count);
    }

    // Get appointment count
    @GetMapping("/dprofilecount")
    public ResponseEntity<Long> getdprofileCount() {
        long count = adminService.displaybookcount();
        return ResponseEntity.ok(count);
    }
}
