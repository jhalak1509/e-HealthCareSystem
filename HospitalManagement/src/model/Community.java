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
public class Community {
    private int communityId;
    private String communityName;
    private long zipCode;
    private String City;

    static int count = 0;

    public Community(String communityName, long zipCode, String City) {
        count++;
        this.communityId = count;
        this.communityName = communityName;
        this.zipCode = zipCode;
        this.City = City;
    }
    
    Community(){
    }

    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
    }
    
    
    
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
    
    public static ArrayList<Community> communityDirectory = new ArrayList<Community>();

    public static ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public static void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        Community.communityDirectory = communityDirectory;
    }
    
    public void deleteCommunity(Community c){
        communityDirectory.remove(c);
    }
    
    @Override
    public String toString(){
        return communityName;
    }
}
