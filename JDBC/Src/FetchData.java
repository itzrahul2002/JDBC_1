package Src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchData {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seconddatabase","root","2002");
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from student");
        while (rs.next()) {
            System.out.println("----------------------------------------------------");
            System.out.println("Student Id  : " + rs.getInt(1));
            System.out.println("Student Name : " + rs.getString(2));
            System.out.println("Student Course : " + rs.getString(3));
            System.out.println("Student Address : " + rs.getString(4));
            System.out.println("----------------------------------------------------");
        }
    }
}
