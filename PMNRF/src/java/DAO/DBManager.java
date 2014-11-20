/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
}
