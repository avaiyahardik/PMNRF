/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.model;

/**
 *
 * @author Shidhav
 */
public class ReliefReport {
    
    private int reportid;
    private String reportName;
    private String description;

    public ReliefReport() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public int getReportid() {
        return reportid;
    }

    public void setReportid(int reportid) {
        this.reportid = reportid;
    }
}
