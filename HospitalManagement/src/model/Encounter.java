/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jhalaksurve
 */
public class Encounter {
    private VitalSign[] vitalSigns;
    private String patientName;
    private int patientAge;
    private char patientGender;
    private String date;
    private String symptoms;
    private String prescription;

    public Encounter(VitalSign[] vitalSigns, String patientName, int patientAge, char patientGender, String date, String symptoms, String prescription) {
        this.vitalSigns = vitalSigns;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
        this.date = date;
        this.symptoms = symptoms;
        this.prescription = prescription;
    }

    public VitalSign[] getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSign[] vitalSigns) {
        this.vitalSigns = vitalSigns;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
    @Override
    public String toString(){
        return patientName;
    }
}
