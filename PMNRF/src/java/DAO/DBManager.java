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
    public boolean validUser(User user) throws Exception {
        try{
            conn=DBConnection.open();
            String sql="select * from harshad.users where username=? and password=?";
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
            
            ps.setString(2,disaster.getDisasterName());
            ps.setString(3,disaster.getType());
            ps.setString(4,disaster.getCity());
            ps.setString(5,disaster.getState());
            java.util.Date d=disaster.getDateOfOccurence();
            java.sql.Date date=new java.sql.Date(d.getYear(), d.getMonth(), d.getDate());
            ps.setDate(6,date);
            ps.setString(7, disaster.getDescription());
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
