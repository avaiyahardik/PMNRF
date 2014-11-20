/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.model;

/**
 *
 * @author Shidhav
 */
public class DisasterAuthority {
    
    private String username;
    private String email;
    private String password;
    private String city;
    private String address;
    private String state;
    private int pincode;
    private String type;
    private String superAuthority;

    public DisasterAuthority(String username, String email, String password, String city, String address, String state, int pincode, String type, String superAuthority) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.city = city;
        this.address = address;
        this.state = state;
        this.pincode = pincode;
        this.type = type;
        this.superAuthority = superAuthority;
    }

    public DisasterAuthority() {
    }

    
    
    public String getSuperAuthority() {
        return superAuthority;
    }

    public void setSuperAuthority(String superAuthority) {
        this.superAuthority = superAuthority;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
