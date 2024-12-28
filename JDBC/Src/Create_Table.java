package Src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Collection;

public class Create_Table {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seconddatabase","root","2002");
            Statement st = con.createStatement();
            st.execute("create table user(User_Id int,UserName varchar(100),Course varchar(100))");
            System.out.println("Table Created Successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
