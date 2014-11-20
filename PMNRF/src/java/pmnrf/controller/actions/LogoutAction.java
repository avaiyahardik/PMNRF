/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.controller.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pmnrf.controller.Action;

/**
 *
 * @author Shidhav
 */
public class LogoutAction implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        Object obj = request.getSession().getAttribute("username");
        //String oldpassword=request.getParameter("oldpassword");
        String username = null;
        if (obj != null) {
            username = obj.toString();
        }
        
        
        
        HttpSession session=request.getSession();
        session.removeAttribute(username);
       // session.removeAttribute("");
         session = request.getSession(false);
        if (session != null) {
        session.invalidate();
}
        return "login.jsp";
    }
}
