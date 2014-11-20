/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import pmnrf.model.Disaster;
import pmnrf.model.User;

/**
 *
 * @author Shidhav
 */
public interface DBOperation {
     
    
    public boolean validUser(User user) throws Exception;
    public void createDisaster(Disaster disaster) throws Exception;
}
