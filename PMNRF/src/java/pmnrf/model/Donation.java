/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.model;

/**
 *
 * @author Ahir
 */
public class Donation {
    private String donorname;
    private String donationdate;
    private int donateamount;
    private Disaster disaster;
    private String CertificateColor;

    public String getCertificateColor() {
        return CertificateColor;
    }

    public void setCertificateColor(String CertificateColor) {
        this.CertificateColor = CertificateColor;
    }

    public Disaster getDisaster() {
        return disaster;
    }

    public void setDisaster(Disaster d) {
        this.disaster = d;
    }

    public int getDonateamount() {
        return donateamount;
    }

    public void setDonateamount(int donateamount) {
        this.donateamount = donateamount;
    }

    public String getDonationdate() {
        return donationdate;
    }

    public void setDonationdate(String donationdate) {
        this.donationdate = donationdate;
    }

    public String getDonorname() {
        return donorname;
    }

    public void setDonorname(String donorname) {
        this.donorname = donorname;
    }
    
    
}
