
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    public static Connection getCon(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con  = DriverManager.getConnection("jdbc:mysql:///hotel","root","root");
            return con;
        }catch(ClassNotFoundException | SQLException e){
        
        return null;
        }
    }
    
}
