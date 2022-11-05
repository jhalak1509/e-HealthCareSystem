/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jhalaksurve
 */
public class Person {
    
    private int personId;
    private String personName;
    private String personEmail;
    private String personPassword;
    private String role;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonPassword() {
        return personPassword;
    }

    public void setPersonPassword(String password) {
        this.personPassword = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public Person(int personId, String personName, String personEmail, String personPassword, String role){
    
        this.personId = personId;
        this.personName = personName;
        this.personEmail = personEmail;
        this.personPassword = personPassword;
        this.role = role;
   
    }
    
}
