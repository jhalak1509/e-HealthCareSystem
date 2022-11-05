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
public class HospitalDirectory {
    
    public static ArrayList<Hospital> hospitalDirectory = new ArrayList<Hospital>();
    
    public HospitalDirectory(){
    
    this.hospitalDirectory = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public void deleteHospital(Hospital h){
        hospitalDirectory.remove(h);
    }
}
