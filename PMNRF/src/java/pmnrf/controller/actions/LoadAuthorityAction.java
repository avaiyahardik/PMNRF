/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.controller.actions;

import DAO.DBManager;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmnrf.controller.Action;
import pmnrf.model.DisasterAuthority;

/**
 *
 * @author Shidhav
 */
public class LoadAuthorityAction implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        String username=(String)request.getSession().getAttribute("username");
        DBManager dbm=new DBManager();
        try{
            List<DisasterAuthority> authorityList=dbm.getSubAuthority(username);
            request.getSession().setAttribute("authorityList", authorityList);
            return "deleteAuthority.jsp";
            
        }catch(Exception e){
            return "error.jsp?msg="+e.toString();
        }
    }
}
