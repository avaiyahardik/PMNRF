/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.model;

/**
 *
 * @author Shidhav
 */
public class Account {
    
    private int accountNo;
    private String bankName;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }    
}
