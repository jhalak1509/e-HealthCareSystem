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
public class PatientDirectory {
    public static ArrayList<Patient> patientDirectory = new ArrayList<Patient>();
    
    /*public static void addNewPatient(String patientName, int patientId, String patientPassword, int patientAge, char patientGender, String patientEmail, String patientCity, String bloodGroup){
        //Patient newPatient = new Patient(patientName,patientId,patientPassword,patientAge,patientGender,patientEmail,patientCity,bloodGroup);   
        patientDirectory.add(new Patient(patientName,patientId,patientPassword,patientAge,patientGender,patientEmail,patientCity,bloodGroup));
        
    }*/
    public PatientDirectory(){        
    this.patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public void deletePatient(Patient p){
        patientDirectory.remove(p);
    }
     /*public Patient addNewPatient(){
        Patient newPatient = new Patient();
        patientDirectory.add(newPatient);
        return newPatient;
    }*/
        

    
}


