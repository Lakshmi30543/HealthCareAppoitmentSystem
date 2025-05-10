package com.project.fsd.service;

import java.util.List;

import com.project.fsd.model.Admin;
import com.project.fsd.model.Patient;
import com.project.fsd.model.Doctor;

public interface AdminService 
{
  public Admin checkadminlogin(String username, String password);
  
  public String addstaff(Patient patient);
  public List<Patient> displaypatient();
  public String deletestaff(int pid);
  
  public List<Doctor> displaydoctors();
  public String deletedoctor(int did);
  
  public long displaypatientcount();
  public long displaydoctorcount();
  public long displaybookcount();

public String addPatient(Patient patient);

public String deleteDoctor(int did);

public String deletePatient(int pid);

long displayDoctorCount();

long displayPatientCount();

long displayDprofileCount();

List<Patient> displayPatients();

List<Doctor> displayDoctors();

String deleteDoctor(String did);

String deleteDoctor1(int did);
}
