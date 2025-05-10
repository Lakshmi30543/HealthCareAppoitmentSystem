package com.project.fsd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fsd.model.Admin;
import com.project.fsd.model.Doctor;
import com.project.fsd.model.Patient;
import com.project.fsd.repository.AdminRepository;
import com.project.fsd.repository.DoctorRepository;
import com.project.fsd.repository.DprofileRepository;
import com.project.fsd.repository.PatientRepository;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private DprofileRepository dprofileRepository;

    @Override
    public Admin checkadminlogin(String username, String password) {
        return adminRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public String addPatient(Patient patient) {
        patientRepository.save(patient);
        return "Patient Added Successfully";
    }

    @Override
    public List<Patient> displayPatients() {
        return patientRepository.findAll();
    }

    @Override
    public List<Doctor> displayDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public String deleteDoctor1(int did) {
        Optional<Doctor> doctor = doctorRepository.findById(did);
        if (doctor.isPresent()) {
            doctorRepository.deleteById(did);
            return "Doctor Deleted Successfully";
        } else {
            return "Doctor ID Not Found";
        }
    }

    @Override
    public String deletePatient(int pid) {
        Optional<Patient> patient = patientRepository.findById(pid);
        if (patient.isPresent()) {
            patientRepository.deleteById(pid);
            return "Patient Deleted Successfully";
        } else {
            return "Patient ID Not Found";
        }
    }

    @Override
    public long displayDoctorCount() {
        return doctorRepository.count();
    }

    @Override
    public long displayPatientCount() {
        return patientRepository.count();
    }

    @Override
    public long displayDprofileCount() {
        return dprofileRepository.count();
    }

	@Override
	public String addstaff(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> displaypatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletestaff(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> displaydoctors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletedoctor(int did) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long displaypatientcount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long displaydoctorcount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long displaybookcount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String deleteDoctor(int did) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteDoctor(String did) {
		// TODO Auto-generated method stub
		return null;
	}
}
