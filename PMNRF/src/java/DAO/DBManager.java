/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import pmnrf.model.Disaster;
import pmnrf.model.DisasterAuthority;
import pmnrf.model.Photo;
import pmnrf.model.User;

/**
 *
 * @author Shidhav
 */
public class DBManager implements DBOperation {

    private static Connection conn;

    @Override
    public Disaster getDisaster(int id) throws Exception {
        try{
            conn=DBConnection.open();
            String sql="select * from disaster where disasterid=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            Disaster d=new Disaster();
            if(rs.next()){
                
                d.setDisasterName(rs.getString("disastername"));
                d.setCity(rs.getString("city"));
                d.setDateOfOccurence(rs.getString("dateofoccurence"));
                d.setDescription(rs.getString("description"));
                d.setDisasterid(getLastDisasterId());
                d.setState(rs.getString("state"));
                d.setType(rs.getString("disastertype"));
            }
            return d;
        }catch(Exception e){
            return null;
        }
    }

    
    
    
    
    @Override
    public Set getAllGCMUser() throws Exception {
        
        try{
            conn=DBConnection.open();
            String sql="select gcm_id from tbl_user";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            Set set=new HashSet();
            while(rs.next()){
                String id=rs.getString(1);
                set.add(id);
            }
            return set;
        }catch(Exception e){
            return null;
        }
    }
    
    @Override
    public boolean deleteAuthority(String authorityName) throws Exception {

        try {
            Connection conn = DBConnection.open();
            PreparedStatement ps = conn.prepareStatement("delete from disasterauthority where username=?");
            ps.setString(1, authorityName);
            //PreparedStatement ps=conn.prepareStatement("insert into goal(roleid,goalname,description,priority,flag,startingdate,expectedenddate,actualenddate) values(4,'Goal1','descruption','p','f','start','end','aend')");
            int count = ps.executeUpdate();
            conn.close();
            if (count > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<DisasterAuthority> getSubAuthority(String username) throws Exception {

        try {
            conn = DBConnection.open();
            String sql = "select * from disasterauthority where superauthority=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            List<DisasterAuthority> authorityList = new ArrayList<DisasterAuthority>();
            DisasterAuthority authority = null;
            while (rs.next()) {
                authority = new DisasterAuthority();
                authority.setUsername(rs.getString(1));
                authorityList.add(authority);
            }
            return authorityList;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void createAuthority(DisasterAuthority authority) throws Exception {

        try {
            Connection conn = DBConnection.open();
            String sql = "insert into disasterauthority values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, authority.getUsername());
            ps.setString(2, authority.getType());
            ps.setString(3, authority.getEmail());
            ps.setString(4, authority.getCity());
            ps.setString(5, authority.getState());
            ps.setInt(6, authority.getPincode());
            ps.setString(7, authority.getAddress());
            ps.setString(8, authority.getSuperAuthority());
            ps.setString(9, authority.getPassword());

            int count = ps.executeUpdate();
            conn.close();
            if (count == 1) {
                return;
            } else {
                throw new Exception("Record Not Inserted ");
            }
        } catch (Exception e) {
            throw new Exception("Connection Error in create user" + e.toString());
        }
    }

    @Override
    public boolean deleteDisaster(Disaster disaster) throws Exception {

        try {
            Connection conn = DBConnection.open();
            PreparedStatement ps = conn.prepareStatement("delete from disaster where disastertype=? and disastername=?");
            ps.setString(1, disaster.getType());
            ps.setString(2, disaster.getDisasterName());
            //PreparedStatement ps=conn.prepareStatement("insert into goal(roleid,goalname,description,priority,flag,startingdate,expectedenddate,actualenddate) values(4,'Goal1','descruption','p','f','start','end','aend')");
            int count = ps.executeUpdate();
            conn.close();
            if (count > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void changepassword(String username, String oldpassword, String newpassword) throws Exception {
        try {

            Connection conn = DBConnection.open();

            assert conn != null;

            PreparedStatement ps = conn.prepareStatement("update user set password=? where username=? and password=? ");

            ps.setString(1, newpassword.trim());
            ps.setString(2, username.trim());
            ps.setString(3, oldpassword.trim());
            //PreparedStatement ps=conn.prepareStatement("insert into goal(roleid,goalname,description,priority,flag,startingdate,expectedenddate,actualenddate) values(4,'Goal1','descruption','p','f','start','end','aend')");
            int count = ps.executeUpdate();
            conn.close();
            if (count > 0) {
                return;
            } else {
                throw new Exception("Record not updated");
            }
        } catch (Exception e) {
            System.out.println("Error Change password: " + e.toString());
        }
    }

    @Override
    public boolean validUser(User user) throws Exception {
        try {
            conn = DBConnection.open();
            String sql = "select * from disasterauthority where username=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String usr = rs.getString("username");
                String pwd = rs.getString("password");
                if ((user.getUsername().equals(usr))) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new Exception("Error in Validuser " + e.toString());
        } finally {
            conn.close();

        }
    }

    @Override
    public void saveFile(Photo photo) throws Exception {
        
        try {
            conn = DBConnection.open();
            String sql2 = "insert into disasterphotos(photopath,description,disasterid) values(?,?,?)";

                PreparedStatement psPhoto = conn.prepareStatement(sql2);
                psPhoto.setBinaryStream(1,photo.getIo());
                psPhoto.setString(2,photo.getDescription());
                psPhoto.setInt(3, getLastDisasterId());
                psPhoto.executeUpdate();
                return;
        } catch (Exception e) {
            throw new Exception("Connection Error in create user" + e.toString());
        }finally {
                conn.close();
        }
    }

    public void createDisaster(Disaster disaster) throws Exception {
        try {
            conn = DBConnection.open();
            String sql = "insert into disaster(disastername,disastertype,city,state,dateofoccurence,description) values (?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, disaster.getDisasterName());
            ps.setString(2, disaster.getType());
            ps.setString(3, disaster.getCity());
            ps.setString(4, disaster.getState());
            ps.setString(5, disaster.getDateOfOccurence());
            ps.setString(6, disaster.getDescription());
            int count = ps.executeUpdate();

            if (count == 1) {
                List<Photo> list=disaster.getPhotos();
                for(Photo p:list){
                    saveFile(p);
                }
                return;
            } 
        } catch (Exception e) {
            throw new Exception("Connection Error in create user" + e.toString());
        }finally {
            conn.close();
        }
    }

    public int getLastDisasterId() throws Exception {
        try {
            Connection conn = DBConnection.open();
            String sql = "select * from disaster order by disasterid desc";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                return id;
            }
            return -1;
        } catch (Exception e) {
            throw new Exception("Connection Error in create user" + e.toString());
        }
    }
}
