/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jhalaksurve
 */
public class Hospital {
    
    private int hospitalId;
    private String hospitalName;
    private String hospitalCommunity;
    private String hospitalCity;
    private String hospitalState;
    
    static int count = 0;

    public Hospital(String hospitalName, String hospitalCommunity, String hospitalCity, String hospitalState) {
        
        count++;
        this.hospitalId = count;
        this.hospitalName = hospitalName;
        this.hospitalCommunity = hospitalCommunity;
        this.hospitalCity = hospitalCity;
        this.hospitalState = hospitalState;
    }

    
    
    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalCommunity() {
        return hospitalCommunity;
    }

    public void setHospitalCommunity(String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public String getHospitalState() {
        return hospitalState;
    }

    public void setHospitalState(String hospitalState) {
        this.hospitalState = hospitalState;
    }
    
    @Override
    public String toString(){
        return hospitalName;
    }

}
