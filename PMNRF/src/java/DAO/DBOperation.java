/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import pmnrf.model.Disaster;
import pmnrf.model.DisasterAuthority;
import pmnrf.model.Donation;
import pmnrf.model.User;

/**
 *
 * @author Shidhav
 */
public interface DBOperation {
     
    
    public boolean validUser(User user) throws Exception;
    public List<Donation> getDonationData() throws Exception;

    public void createDisaster(Disaster disaster) throws Exception;

    public void changepassword(String username, String oldpassword, String newpassword) throws Exception;

    public boolean deleteDisaster(Disaster disaster) throws Exception;
    
    public void createAuthority(DisasterAuthority authority) throws Exception;
    
    public List<DisasterAuthority> getSubAuthority(String username) throws Exception;
    
    public boolean deleteAuthority(String authorityName) throws Exception;
    
}
