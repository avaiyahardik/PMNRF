/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.controller.actions;

import DAO.DBManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmnrf.controller.Action;
import pmnrf.model.DisasterAuthority;

/**
 *
 * @author Shidhav
 */
public class CreateAuthorityAction  implements Action{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        String username=request.getParameter("username");
        String authorityType=request.getParameter("authorityType");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        //String confirmPassword=request.getParameter("confirmPassword");
        String city=request.getParameter("city");
        String state=request.getParameter("state");
        String pincode=request.getParameter("pincode");
        String address=request.getParameter("address");
        
        String superAuthority=(String)request.getSession().getAttribute("username");
        DisasterAuthority auth=new DisasterAuthority(username, email, password, city, address, state, Integer.parseInt(pincode),authorityType,superAuthority);
        DBManager dbm=new DBManager();
        
        try{
            dbm.createAuthority(auth);
            return "index.jsp";
        }catch(Exception e){
            return "error.jsp";
        }
        
       // return "error.jsp?msg=okay";
    }
}
