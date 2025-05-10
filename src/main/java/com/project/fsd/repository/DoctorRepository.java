package com.project.fsd.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.fsd.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    Doctor findByUsernameAndPassword(String username, String password);

    @Query("SELECT d FROM Doctor d WHERE d.speciality = :speciality")
    List<Doctor> findDoctorsBySpeciality(@Param("speciality") String speciality);

    @Query("SELECT COUNT(d) FROM Doctor d")
    long countDoctors();

	Optional<Doctor> findById(int id);
}
