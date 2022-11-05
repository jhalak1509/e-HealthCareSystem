/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jhalaksurve
 */
public class Patient {
    
    private String patientName;
    private int patientId;
    private String patientPassword;
    private int patientAge;
    private char patientGender;
    private String patientEmail;
    private String patientCity;
    private String bloodGroup;

    static int count = 0;
    
    public Patient(String patientName,String patientPassword, int patientAge, char patientGender, String patientEmail, String patientCity, String bloodGroup){
    
        
        count++;
        this.patientName = patientName;
        this.patientId = count;
        this.patientPassword = patientPassword;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
        this.patientEmail = patientEmail;
        this.patientCity = patientCity;
        this.bloodGroup = bloodGroup;
    }
    
    Patient(){
    }
    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public char getGender() {
        return patientGender;
    }

    public void setGender(char patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientCity() {
        return patientCity;
    }

    public void setPatientCity(String patientCity) {
        this.patientCity = patientCity;
    }

    public char getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(char patientGender) {
        this.patientGender = patientGender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
     @Override
    public String toString(){
        return patientName;
    }

    
        
    
//  patientDirectory.add(new Patient( "Shubhi","1","Shubhi",23,"shubhimiradwal2304@gmail.com","Indore"));

}
