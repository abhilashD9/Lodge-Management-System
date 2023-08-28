
package project;

 import java.sql.*;
import javax.swing.JOptionPane;

public class tables {
    
    public static void main(String[] args){
        
        Connection con = null;
        Statement st = null;
        try{
            
            con =  ConnectionProvider.getCon();
            st= con.createStatement();
          st.executeUpdate("create table users(name varchar(50),email varchar(50),password varchar(30), securityquestion varchar(50), answer varchar(50), address varchar(50), status varchar(50))");
          st.executeUpdate("create table room(roomNo varchar(10) PRIMARY KEY, roomType varchar(20), bedType varchar(20), price int, status varchar(20))"); 
         st.executeUpdate("create table customer(cid int PRIMARY KEY, name varchar(30), mobileNumber varchar(10), nationality varchar(20), gender varchar(20), email varchar(50), idProof varchar(30), address varchar(100), checkIn varchar(30), roomNo varchar(10), bedType varchar(30), roomType varchar(30), pricePerDay int(10), numberOfDaysStay int(10), totalAmount varchar(20),checkout varchar(30))");
          JOptionPane.showMessageDialog(null, "Table created Successfully");
            
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
            con.close();
            st.close();
        }
            catch(Exception e){
            
            
            }
        }
    }
}
