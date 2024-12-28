package Src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update_Data {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seconddatabase","root","2002");
        Statement st = con.createStatement();

        int i =st.executeUpdate("update student set Course='Project Manager' where id = 6");

        System.out.println((i>0) ? "Data Updated successfully" : "Data Not Updated successfully");
    }
}
