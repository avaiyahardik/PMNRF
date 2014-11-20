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
    public void changepassword(String username, String oldpassword, String newpassword) throws Exception 
    {
         try{
            
               Connection conn=DBConnection.open();
          
               assert conn!=null;
               
               PreparedStatement ps=conn.prepareStatement("update user set password=? where username=? and password=? ");
               
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
            throw new Exception("Error in Validuser "+ e.toString());
        }finally {
           conn.close();
                    
        }
    }
    
    public void createDisaster(Disaster disaster) throws Exception{
        
        try{
            /*Connection conn=DBConnection.open();
            String sql="insert into disaster(disastername,disastertype,city,state,dateofoccurence,description) values (?,?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,user.getEmail().toString().trim());
            ps.setString(2,user.getFirstName().toString());
            ps.setString(3,user.getLastname().toString());
            ps.setString(4,UtilsSecure.encrypt(user.getPassword().toString()));
            ps.setString(5, user.getGender().toString());
            System.out.println("Inside create user............");
            ps.setString(6,user.getPhotoPath());
            ps.setBoolean(7,user.isIsActive());
            ps.setBoolean(8,user.isIsFBUser());
            
            int count=ps.executeUpdate();
            conn.close();
            if(count==1){
                Role personalRole=new Role("Personal","Default Personal Goal");
                personalRole.setShared(false);
                createRole(personalRole,user.getEmail());
            }else {
                throw new DAOException("Record Not Inserted ");
            }*/
        }catch(Exception e){
            throw new Exception("Connection Error in create user"+e.toString());
        }
    }

    @Override
    public void createDisaster(User user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
