
import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shruti
 */
public class DBConnection {
    static Connection con=null;
    
    static Connection getConnection() {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con =(Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost/storehub","root","");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
        
    
    

