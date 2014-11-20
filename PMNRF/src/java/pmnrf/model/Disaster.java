/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.model;

import java.util.Date;

/**
 *
 * @author Shidhav
 */
public class Disaster {
    
    private int disasterid;
    private String disasterName;
    private String type;
    private String city;
    private String state;
    private String dateOfOccurence;
    private String description;

    public Disaster(String disasterName, String type, String city, String state, String dateOfOccurence, String description) {
        this.disasterName = disasterName;
        this.type = type;
        this.city = city;
        this.state = state;
        this.dateOfOccurence = dateOfOccurence;
        this.description = description;
    }

    public Disaster(String disasterName, String type) {
        this.disasterName = disasterName;
        this.type = type;
    }

    
    
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateOfOccurence() {
        return dateOfOccurence;
    }

    public void setDateOfOccurence(String dateOfOccurence) {
        this.dateOfOccurence = dateOfOccurence;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisasterName() {
        return disasterName;
    }

    public void setDisasterName(String disasterName) {
        this.disasterName = disasterName;
    }

    public int getDisasterid() {
        return disasterid;
    }

    public void setDisasterid(int disasterid) {
        this.disasterid = disasterid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
