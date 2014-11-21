/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pmnrf.model.Disaster;
import pmnrf.model.DisasterAuthority;
import pmnrf.model.Donation;
import pmnrf.model.User;

/**
 *
 * @author Shidhav
 */
public class DBManager implements DBOperation {

    private static Connection conn;

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
        
        try{
            conn=DBConnection.open();
            String sql="select * from disasterauthority where superauthority=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            
            ps.setString(1,username);
            ResultSet rs=ps.executeQuery();
            List<DisasterAuthority> authorityList=new ArrayList<DisasterAuthority>();
            DisasterAuthority authority=null;
            while(rs.next()){
                authority=new DisasterAuthority();
                authority.setUsername(rs.getString(1));
                authorityList.add(authority);
            }
            return authorityList;
        }catch(Exception e){
            return null;
        }
    }
    
    @Override
    public void createAuthority(DisasterAuthority authority) throws Exception {

        try {
            Connection conn = DBConnection.open();
            String sql = "insert into disasterauthority values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,authority.getUsername());
            ps.setString(2,authority.getType());
            ps.setString(3,authority.getEmail());
            ps.setString(4,authority.getCity());
            ps.setString(5,authority.getState());
            ps.setInt(6, authority.getPincode());
            ps.setString(7,authority.getAddress());
            ps.setString(8,authority.getSuperAuthority());
            ps.setString(9,authority.getPassword());
            
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

            PreparedStatement ps = conn.prepareStatement("update disasterauthority set password=? where username=? and password=? ");

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

    public void createDisaster(Disaster disaster) throws Exception {
        try {
            Connection conn = DBConnection.open();
            String sql = "insert into disaster(disastername,disastertype,city,state,dateofoccurence,description) values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, disaster.getDisasterName());
            ps.setString(2, disaster.getType());
            ps.setString(3, disaster.getCity());
            ps.setString(4, disaster.getState());
            ps.setString(5, disaster.getDateOfOccurence());
            ps.setString(6, disaster.getDescription());
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
    public List<Donation> getDonationData() throws Exception {
        try{
            conn=DBConnection.open();
            String sql="select * from (SELECT donorname,donationdate,donation.disasterid,donatedamount,certificatereceiptid,disastername,disastertype FROM donation join disaster on donation.disasterid=disaster.disasterid) as r join certificatereceived on certificatereceiptid=certificatereceived.receiptid";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            List<Donation> DonationList=new ArrayList<Donation>();
            Donation d=null;
            while(rs.next()){
                d=new Donation();
                d.setDonorname(rs.getString("donorname"));
                d.setDonateamount(rs.getInt("donatedamount"));
                d.setDonationdate(rs.getString("donationdate"));
                d.setCertificateColor(rs.getString("certificatecolor"));
                Disaster dis=new Disaster(rs.getString("disastername"),rs.getString("disastertype"));                
                d.setDisaster(dis);
                DonationList.add(d);
                
            }
            return DonationList;
        }catch(Exception e){
            return null;
        }
    }
}
