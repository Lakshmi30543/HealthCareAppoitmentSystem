package com.project.fsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fsd.model.Book;
import com.project.fsd.model.Doctor;
import com.project.fsd.model.Patient;
import com.project.fsd.repository.BookRepository;
import com.project.fsd.repository.DoctorRepository;
import com.project.fsd.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Patient checkPatientLogin(String username, String password) {
        return patientRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public List<Doctor> viewAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Patient getPatientById(int patientId) {
        return patientRepository.findById(patientId).orElse(null);
    }

    @Override
    public List<Book> getAppointmentsByPatient(int patientId) {
        return bookRepository.getBookingsByPatient(patientId);
    }

    @Override
    public String updateAppointmentStatus(int appointmentId, String status) {
        int updatedCount = bookRepository.updateStatusById(status, appointmentId);
        if (updatedCount > 0) {
            return "Appointment status updated successfully.";
        }
        return "Failed to update appointment status.";
    }

    @Override
    public String bookAppointment(Book book) {
        bookRepository.save(book);
        return "Appointment booked successfully.";
    }

	@Override
	public String patientRegistration(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updatePatientProfile(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor getDoctorById(int doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return null;
	}
}
