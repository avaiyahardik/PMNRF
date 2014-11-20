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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import pmnrf.controller.Action;
import pmnrf.model.Disaster;

/**
 *
 * @author Shidhav
 */
public class AddDisasterAction implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        String disasterName = request.getParameter("disasterName");
        String disasterType = request.getParameter("disasterType");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String description = request.getParameter("description");
        String d = request.getParameter("dateOfOccurence");

        String photo1 = request.getParameter("photo1");
        String photo2 = request.getParameter("photo2");
        String photo3 = request.getParameter("photo3");
        String photo4 = request.getParameter("photo4");
        String photo5 = request.getParameter("photo5");
        int i = 0;
        String photoArray[] = new String[5];
        if (photo1 != null) {
            photoArray[i++] = photo1;
        }
        if (photo2 != null) {
            photoArray[i++] = photo2;
        }
        if (photo3 != null) {
            photoArray[i++] = photo3;
        }
        if (photo4 != null) {
            photoArray[i++] = photo4;
        }
        if (photo5 != null) {
            photoArray[i++] = photo5;
        }

        Disaster disaster = new Disaster(disasterName, disasterType, city, state, d, description);
        DBManager dbm = new DBManager();
        try {
            dbm.createDisaster(disaster);
            for (int index=0;index<i;index++) {
                String photoName=photoArray[index];
                final Part filePart = request.getPart(photoName);
                final String fileName = getFileName(filePart);

                OutputStream out = null;
                InputStream fileContent = null;
                String pname=disasterName+"_"+index;
                out = new FileOutputStream(request.getServletContext().getRealPath(File.separator) + pname);
                fileContent = filePart.getInputStream();
                int read = 0;
                final byte[] bytes = new byte[1024];

                while ((read = fileContent.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
                if (out != null) {
                    out.close();
                }
                if (fileContent != null) {
                    fileContent.close();
                }
            }

            return "index.jsp";

        } catch (Exception e) {
            return "error.jsp?msg=" + e.toString();
        }
    }

    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");

        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
}
