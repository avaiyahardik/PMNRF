/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pmnrf.model.Disaster;
import pmnrf.model.DisasterAuthority;
import pmnrf.model.User;
/**
 *
 * @author Shidhav
 */
public class DBManager  implements DBOperation {

    private static Connection conn;

    @Override
    public boolean deleteDisaster(Disaster disaster) throws Exception {
        
        try{
            Connection conn=DBConnection.open();
               PreparedStatement ps=conn.prepareStatement("delete from disaster where disastertype=? and disastername=?");               
               ps.setString(1,disaster.getType());
               ps.setString(2, disaster.getDisasterName());
               //PreparedStatement ps=conn.prepareStatement("insert into goal(roleid,goalname,description,priority,flag,startingdate,expectedenddate,actualenddate) values(4,'Goal1','descruption','p','f','start','end','aend')");
               int count=ps.executeUpdate();
               conn.close();
               if(count>0){ 
                   return true;
               }
               else {
                   return false;
               }
        }catch(Exception e){
            return false;
        }
    }
    
    
    @Override
    public void changepassword(String username, String oldpassword, String newpassword) throws Exception 
    {
         try{
            
               Connection conn=DBConnection.open();
          
               assert conn!=null;
               
               PreparedStatement ps=conn.prepareStatement("update users set password=? where username=? and password=? ");
               
               ps.setString(1,newpassword.trim());
               ps.setString(2, username.trim());
               ps.setString(3,oldpassword.trim());
               //PreparedStatement ps=conn.prepareStatement("insert into goal(roleid,goalname,description,priority,flag,startingdate,expectedenddate,actualenddate) values(4,'Goal1','descruption','p','f','start','end','aend')");
               int count=ps.executeUpdate();
               conn.close();
               if(count>0){ 
                   return;
               }
               else {
                   throw new Exception("Record not updated" );
               }
        }catch(Exception e){
            System.out.println("Error Change password: "+e.toString());
        }
    }
    
    @Override
    public boolean validUser(User user) throws Exception {
        try{
            conn=DBConnection.open();
            String sql="select * from user where username=? and password=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String usr=rs.getString("username");
                String pwd=rs.getString("password");
                if((user.getUsername().equals(usr))) {
                    return true;
                }
                else {
                    return false;
                }
            }else {
                return false;
            }
        }catch(Exception e){
            throw new Exception("Error in Valiuser ");
        }finally {
           conn.close();
                    
        }
    }
    
    public void createDisaster(Disaster disaster) throws Exception{        
        try{
            Connection conn=DBConnection.open();
            String sql="insert into disaster(disastername,disastertype,city,state,dateofoccurence,description) values (?,?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            
            ps.setString(1,disaster.getDisasterName());
            ps.setString(2,disaster.getType());
            ps.setString(3,disaster.getCity());
            ps.setString(4,disaster.getState());
            ps.setString(5,disaster.getDateOfOccurence());
            ps.setString(6, disaster.getDescription());
            int count=ps.executeUpdate();
            conn.close();
            if(count==1){
                return;
            }else {
                throw new Exception("Record Not Inserted ");
            }
        }catch(Exception e){
            throw new Exception("Connection Error in create user"+e.toString());
        }
    }

   
}
