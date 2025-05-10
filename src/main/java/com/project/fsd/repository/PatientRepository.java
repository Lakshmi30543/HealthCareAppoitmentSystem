package com.project.fsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.fsd.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
  
    Patient findByUsernameAndPassword(String username, String password);
  
    @Query("SELECT COUNT(p) FROM Patient p")
    long patientCount();
}
