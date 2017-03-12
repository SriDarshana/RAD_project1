/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.sql.* ;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class dbconnect {
    static final String DB_Driver = "com.mysql.jdbc.Driver" ;
     static final String DB_URL = "jdbc:mysql://localhost:3306/rad";
     static final String DB_USER = "root";
     static final String DB_PASSWD ="";
     
     static Connection conn = null;
     public static Connection getConnection(){
       try{
      Class.forName(DB_Driver);
           conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
       
       }catch(Exception e){
          JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);   
       }  
       return conn;
     }
}
