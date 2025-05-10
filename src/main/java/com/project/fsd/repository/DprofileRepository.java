package com.project.fsd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.fsd.model.Dprofile;
import com.project.fsd.model.Patient;

@Repository
public interface DprofileRepository extends JpaRepository<Dprofile, Integer> {

    // Find doctor profiles associated with a particular patient
    List<Dprofile> findByPatient(Patient patient);

    // Count the total number of doctor profiles
    @Query("select count(d) from Dprofile d")
    long dprofileCount();
}
