/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.controller.actions;

import DAO.DBManager;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmnrf.controller.Action;
import pmnrf.model.Disaster;

/**
 *
 * @author Shidhav
 */
public class AddDisasterAction implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        String disasterName=request.getParameter("disasterName");
        String disasterType=request.getParameter("disasterType");
        String city=request.getParameter("city");
        String state=request.getParameter("state");
        String description=request.getParameter("description");
        String d=request.getParameter("dateOfOccurence");
        Date date=new Date(d);
        Disaster disaster=new Disaster(disasterName, disasterType, city, state, date, description);
        DBManager dbm=new DBManager();
        try{
            
            
        }catch(Exception e){
            return "error.jsp?msg="+e.toString();
        }
        
        
        return "error.jsp?msg=okay harshad";
    }
    
    
}
