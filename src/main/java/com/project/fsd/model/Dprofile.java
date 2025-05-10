package com.project.fsd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "dprofile_table")
public class Dprofile {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true, length = 100)
    private String name;

    @Column(nullable = true, length = 100)
    private String specialization;

    @Column(nullable = true, length = 500)
    private String description;

    @Column(nullable = true)
    private int experience; // in years

    @Column(nullable = true)
    private double consultationFee;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    // Getters and Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
