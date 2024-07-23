package domain.naming.system;
import java.sql.*;
public class Conn 
{
        Connection c;
       Statement s;
       
        Conn()  {
            try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
              c =DriverManager.getConnection("jdbc:mysql:///dns", "root", "" ); 
           
            s =c.createStatement();             
           
        }catch(Exception e){ 
            e.printStackTrace();
        }  
        }}
