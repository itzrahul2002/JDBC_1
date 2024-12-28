package Src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_Data {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seconddatabase","root","2002");
        Statement st = con.createStatement();

        String query = "delete from Student where id = 6";
        int i = st.executeUpdate(query);
        System.out.println((i>0) ?"Data deleted Successfully" : "Not Deleted Data");
    }
}
