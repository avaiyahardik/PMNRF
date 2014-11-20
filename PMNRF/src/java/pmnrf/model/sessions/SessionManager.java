/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.model.sessions;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Shidhav
 */
public class SessionManager {
    
    
    public static void openSession(HttpServletRequest request,HttpServletResponse response, String username, String password) throws Exception {
        
        HttpSession session=request.getSession();
        session.setAttribute("username",username);
        session.setAttribute("password",password);
        
        return;
        
    }
    
    
}
