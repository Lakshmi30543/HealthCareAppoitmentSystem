package com.project.fsd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.fsd.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    // Get all bookings for a given Doctor entity by doctorId
    List<Book> findByDoctorId(int doctorId);

    // Get all bookings for a specific patient via the dprofile.patient relationship
    @Query("SELECT b FROM Book b WHERE b.dprofile.patient.id = ?1")
    List<Book> getBookingsByPatient(int patientId);

    // Update the status of a booking by its ID
    @Modifying
    @Transactional
    @Query("UPDATE Book b SET b.status = ?2 WHERE b.id = ?1")
    int updateStatusById(String status, int appointmentId);
}
