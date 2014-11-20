/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.controller.actions;

import DAO.DBManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmnrf.controller.Action;
import pmnrf.model.Disaster;

/**
 *
 * @author Shidhav
 */
public class DeleteDisasterAction implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        String disasterType=request.getParameter("disasterType");
        String disasterName=request.getParameter("disasterName");
        
        Disaster disaster=new Disaster(disasterName, disasterType);
        DBManager dbm=new DBManager();
        try{
            boolean flag=dbm.deleteDisaster(disaster);
            if(flag){
                return "index.jsp";
            }
            return "error.jsp";
        }catch(Exception e){
            return "error.jsp";
        }
    }
    
}
