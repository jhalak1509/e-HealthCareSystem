/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jhalaksurve
 */
public class DoctorDirectory {
    
    public static ArrayList<Doctor> doctorDirectory = new ArrayList<Doctor>();
    
    public static void addNewDoctor(String doctorName, int doctorId, String doctorPassword, String doctorSpecialization, String doctorEmail, String doctorCity, String hospitalName){
       // Doctor newDoctor = new Doctor(doctorName,doctorId,doctorPassword,doctorSpecialization,doctorEmail,doctorCity,hospitalId);    
        doctorDirectory.add(new Doctor(doctorName,doctorId,doctorPassword,doctorSpecialization,doctorEmail,doctorCity,hospitalName));
        
    }
    
    public DoctorDirectory(){
    
    this.doctorDirectory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
//    public Doctor addDoctor(){
//        Doctor newDoctor = new Doctor();
//        doctorDirectory.add(newDoctor);
//        return newDoctor;
//    }
    
    public void deleteDoctor(Doctor d){
        doctorDirectory.remove(d);
    }
    
}
