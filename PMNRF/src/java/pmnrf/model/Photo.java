/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.model;

import java.io.InputStream;

/**
 *
 * @author Shidhav
 */
public class Photo {
    
    private InputStream io;
    private String description;
    private int disasterid;

    public Photo(InputStream io, String description) {
        this.io = io;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDisasterid() {
        return disasterid;
    }

    public void setDisasterid(int disasterid) {
        this.disasterid = disasterid;
    }

    public InputStream getIo() {
        return io;
    }

    public void setIo(InputStream io) {
        this.io = io;
    }
    
    
    
    
    
}
