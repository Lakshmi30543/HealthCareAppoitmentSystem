package com.project.fsd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fsd.model.Book;
import com.project.fsd.model.Doctor;
import com.project.fsd.model.Patient;
import com.project.fsd.repository.BookRepository;
import com.project.fsd.repository.DoctorRepository;
import com.project.fsd.repository.PatientRepository;

@Service
public class DoctorServiceImpl implements DoctorService
{
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;
    
    @Autowired
    private BookRepository bookRepository;

    @Override
    public String doctorRegistration(Doctor doctor) 
    {
        doctorRepository.save(doctor);
        return "Doctor Registered Successfully";
    }

    @Override
    public Doctor checkDoctorLogin(String username, String password) 
    {
        return doctorRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public String updateDoctorProfile(Doctor doctor) 
    {
        Optional<Doctor> object = doctorRepository.findById(doctor.getId());
        
        String msg = null;
        
        if(object.isPresent()) 
        {
            Doctor d = object.get();
            d.setName(doctor.getName());
            d.setUsername(doctor.getUsername());
            d.setPhone(doctor.getPhone());
            d.setSpeciality(doctor.getSpeciality());
            
            doctorRepository.save(d);
            msg = "Doctor Profile Updated Successfully";
        } 
        else 
        {
            msg = "Doctor ID Not Found to Update";
        }
        return msg;
    }

    @Override
    public List<Doctor> getAllDoctors() 
    {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById1(int did) 
    {
        return doctorRepository.findById(did).orElse(null);
    }

    @Override
    public List<Patient> viewAllPatients() 
    {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(int patientId) 
    {
        return patientRepository.findById(patientId).orElse(null);
    }

    @Override
    public String bookAppointment(Book book) 
    {
        bookRepository.save(book);
        return "Appointment Booked Successfully";
    }

    @Override
    public List<Book> getAppointmentsByDoctor(int did) 
    {
        return bookRepository.findByDoctorId(did);
    }

	@Override
	public Doctor getDoctorById(int did) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteDoctorById(int did) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor getDoctorById(String did) {
		// TODO Auto-generated method stub
		return null;
	}
}
