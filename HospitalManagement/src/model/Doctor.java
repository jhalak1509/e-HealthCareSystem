/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jhalaksurve
 */
public class Doctor {
    
    private  String doctorName;
    private  int doctorId;
    private  String doctorPassword;
    private  String doctorSpecialization;
    private  String doctorEmail;
    private  String doctorCity;
    private  String hospitalName;
    static int count = 0;
    
    public Doctor(String doctorName, String doctorPassword, String doctorSpecialization, String doctorEmail, String doctorCity, String hospitalName) {
        
        count++;
        this.doctorName = doctorName;
        this.doctorId = count;
        this.doctorPassword = doctorPassword;
        this.doctorSpecialization = doctorSpecialization;
        this.doctorEmail = doctorEmail;
        this.doctorCity = doctorCity;
        this.hospitalName = hospitalName;
    } 
    public Doctor() {
       }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getDoctorCity() {
        return doctorCity;
    }

    public void setDoctorCity(String doctorCity) {
        this.doctorCity = doctorCity;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }
    
    @Override
    public String toString(){
        return doctorName;
    }

    
    
   
//    Doctor(String doctorName, int doctorId, String doctorPassword, String doctorSpecialization, String doctorEmail, String doctorCity, String hospitalName){
//    
//        this.doctorName = doctorName;
//        this.doctorId = doctorId;
//        this.doctorPassword = doctorPassword;
//        this.doctorSpecialization = doctorSpecialization;
//        this.doctorEmail = doctorEmail;
//        this.doctorCity = doctorCity;
//        this.hospitalName = hospitalName;
//    }

    
}
//"Dr. Arpita Rai",1,"arpita123","Allergy and Immunology","arpitarai@gmail.com","Boston",1