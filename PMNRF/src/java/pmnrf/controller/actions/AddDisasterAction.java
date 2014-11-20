/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.controller.actions;

import DAO.DBManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import pmnrf.controller.Action;
import pmnrf.model.Disaster;
import pmnrf.model.Photo;

/**
 *
 * @author Shidhav
 */
public class AddDisasterAction implements Action {

    public String execute(HttpServletRequest request, HttpServletResponse response) {

        String disasterName = request.getParameter("disasterName");
        String disasterType = request.getParameter("disasterType");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String description = request.getParameter("description");
        String d = request.getParameter("dateOfOccurence");
        
        OutputStream out = null;
        InputStream filecontent = null;

        try {
            Disaster disaster = new Disaster(disasterName, disasterType, city, state, d, description);
            DBManager dbm = new DBManager();
            final Part filePart1 = request.getPart("photo1");
            final Part filePart2 = request.getPart("photo2");
            final Part filePart3 = request.getPart("photo3");
            final Part filePart4 = request.getPart("photo4");
            final Part filePart5 = request.getPart("photo5");
            
            int i=0;
            List<Part> parts=new ArrayList<Part>();
            if(filePart1!=null) 
                parts.add(filePart1);
            if(filePart2!=null) 
                parts.add(filePart2);
            if(filePart3!=null) 
                parts.add(filePart3);
            if(filePart4!=null) 
                parts.add(filePart4);
            if(filePart5!=null) 
                parts.add(filePart5);
            List<Photo> list=new ArrayList<Photo>();
            Photo p=null;
            for(Part part: parts){
                p=new Photo(part.getInputStream(), null);
                list.add(p);
                //filecontent = part.getInputStream();
            }
            disaster.setPhotos(list);
            dbm.createDisaster(disaster);
            return "index.jsp";
        } catch (Exception fne) {
            return "error.jsp?msg="+fne.toString();
        }
    }
}
