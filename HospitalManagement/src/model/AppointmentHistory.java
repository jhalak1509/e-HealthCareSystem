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
public class AppointmentHistory {
    
    public static ArrayList<Appointment> appointmentHistory = new ArrayList<Appointment>();

    public AppointmentHistory() {
        this.appointmentHistory = new ArrayList<Appointment>();
    }

    public static ArrayList<Appointment> getAppointmentHistory() {
        return appointmentHistory;
    }

    public static void setAppointmentHistory(ArrayList<Appointment> appointmentHistory) {
        AppointmentHistory.appointmentHistory = appointmentHistory;
    }
    
    
}
