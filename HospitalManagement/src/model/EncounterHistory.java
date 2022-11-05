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
public class EncounterHistory {
    
    public static ArrayList<Encounter> encounterHistory = new ArrayList<Encounter>();

    public EncounterHistory() {
        this.encounterHistory = new ArrayList<Encounter>();
    }

    public static ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public static void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        EncounterHistory.encounterHistory = encounterHistory;
    }
    
    
}
