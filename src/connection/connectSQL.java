package connection;
import java.sql.*;
public class connectSQL {
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/billingdb","root","pass123456");
            return cn;
        }catch(Exception e){
            return null;
        }
    }
}
