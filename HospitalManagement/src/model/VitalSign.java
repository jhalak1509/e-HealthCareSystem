/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jhalaksurve
 */
public class VitalSign {
    
    private double temperature;
    private int pulseRate;
    private int respirationRate;
    private int bloodPressure;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public VitalSign(double temperature, int pulseRate, int respirationRate, int bloodPressure) {
        this.temperature = temperature;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        this.bloodPressure = bloodPressure;
    }
    
    
}
