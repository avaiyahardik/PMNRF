/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.controller.actions;

import DAO.DBManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmnrf.controller.Action;

/**
 *
 * @author Shidhav
 */
public class ChangePasswordAction implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        
         Object obj = request.getSession().getAttribute("username");
        String oldpassword=request.getParameter("currentpassword");
        String username = null;
        if (obj != null) {
            username = obj.toString();
        }
        String newpassword = request.getParameter("newpassword");
        DBManager dbm = new DBManager();
        
        try {
            dbm.changepassword(username, oldpassword, newpassword);
            
        } catch (Exception ex) {
            System.out.println("Error in change password :"+ ex.toString());
        }
        return "index.jsp";
    }
}
