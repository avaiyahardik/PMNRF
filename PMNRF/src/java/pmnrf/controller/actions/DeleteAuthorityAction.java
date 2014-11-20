/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.controller.actions;

import DAO.DBManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmnrf.controller.Action;

/**
 *
 * @author Shidhav
 */
public class DeleteAuthorityAction implements Action  {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        String authorityName=request.getParameter("authorityName");
        DBManager dbm=new DBManager();
        try{
            boolean flag=dbm.deleteAuthority(authorityName);
            if(flag){
                return "index.jsp";
            }
            return "error.jsp?msg=Could not delete Authority "+authorityName;
        }catch(Exception e){
            return "error.jsp";
        }
    }
}
