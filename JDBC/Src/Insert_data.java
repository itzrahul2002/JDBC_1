package Src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_data {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seconddatabase","root","2002");
        Statement st = con.createStatement();

        String query = "insert into user(User_Id,UserName,Course)values(1,'Rahul','Java FullStack')";
        int i=st.executeUpdate(query);

        System.out.println((i>0) ? "Record Inserted Successfully" : "Record Insertion Failed");
    }
}
