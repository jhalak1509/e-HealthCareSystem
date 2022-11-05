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
public class PersonDirectory {
    
    public static ArrayList<Person> personDirectory = new ArrayList<Person>();
    
    public static void addNewPerson(int personId, String personName, String personEmail, String personPassword, String role){
        //Patient newPatient = new Patient(patientName,patientId,patientPassword,patientAge,patientGender,patientEmail,patientCity,bloodGroup);   
        personDirectory.add(new Person(personId,personName,personEmail,personPassword,role));
        
    }
    
    
    public PersonDirectory(){
    
    this.personDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
}
