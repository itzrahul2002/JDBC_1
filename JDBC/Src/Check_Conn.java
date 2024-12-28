package Src;

import java.sql.Connection;
import java.sql.DriverManager;

public class Check_Conn {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seconddatabase","root","2002");

            if(con!=null){
                System.out.println("Connecting Successfully");
            }
            else {
                System.out.println("Connect Failed");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
