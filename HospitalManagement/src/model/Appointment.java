/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jhalaksurve
 */
public class Appointment {
    
    
    private String patientName;
    private int patientAge;
    private char patientGender;
    private String reason;
    private String doctorName;
    private String hospitalName;
    private String date;
    private String time;

    public Appointment(String patientName, int patientAge, char patientGender, String reason, String doctorName, String hospitalName, String date, String time) {
        
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
        this.reason = reason;
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
        this.date = date;
        this.time = time;
    }

    

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public char getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(char patientGender) {
        this.patientGender = patientGender;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    @Override
    public String toString(){
        return patientName;
    }
}


