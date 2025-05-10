package com.project.fsd.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "books_table")
public class Book {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "doctor_profile_id")
    private Dprofile dprofile;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @Column(nullable = true)
    private String dname;

    @Column(nullable = true)
    private String appointment_date;
    
    @Column(nullable = true)
    private String status;
    
    @Column(nullable = true)
    private int appointment_id;
    
    @Column(nullable = true)
    private int timeslot;

    @Column(nullable = true)
    private String reason;

    @CreationTimestamp
    @Column(nullable = true)
    private LocalDateTime bookingtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dprofile getDprofile() {
        return dprofile;
    }

    public void setDprofile(Dprofile dprofile) {
        this.dprofile = dprofile;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getStartdate() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getAppointment_Date() {
        return appointment_date;
    }

    public void setAppointment_Date(String appointment_date) {
        this.appointment_date = appointment_date;
    }

    public int getTimeSlots() {
        return timeslot;
    }

    public void setTimeSlot(int timeslot) {
        this.timeslot = timeslot;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getBookingtime() {
        return bookingtime;
    }

    public void setBookingtime(LocalDateTime bookingtime) {
        this.bookingtime = bookingtime;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", dprofile=" + dprofile + ", doctor=" + doctor +
               ", dname=" + dname + ", appointment_date=" + appointment_date +
               ", timeslot=" + timeslot + ", reason=" + reason +
               ", bookingtime=" + bookingtime + "]";
    }

	public String getAppointment_date() {
		return appointment_date;
	}

	public void setAppointment_date(String appointment_date) {
		this.appointment_date = appointment_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(int timeslot) {
		this.timeslot = timeslot;
	}

	public String getDname() {
		return dname;
	}

	public int getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}
}
