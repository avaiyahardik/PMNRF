/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.controller.actions;

import DAO.DBManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmnrf.controller.Action;
import pmnrf.model.User;

/**
 *
 * @author Shidhav
 */
public class LoginAction implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {


        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user=new User(username,password);
        try {
            boolean isValid=new DBManager().validUser(user);
            if(isValid){
                return "index.jsp";
            }    
            return "login.jsp";
        } catch (Exception e) {
            return "error.jsp?msg='" + e.toString() + "'";
        }
        //return "error.jsp?msg=okay";
    }
}
