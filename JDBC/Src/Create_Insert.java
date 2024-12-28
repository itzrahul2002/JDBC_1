package Src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_Insert {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seconddatabase","root","2002");
        Statement st = con.createStatement();

        String query = "create table avenger(Id int,Name varchar(100),Power varchar(100))";
        String query2 = "insert into avenger (Id,Name,Power) values(101,'Ironman','Arc Reactor'),"+"(102,'Thor','God Of Thunder'),"+"(103,'Hulk','Smash Power')";

        st.execute(query);
        st.executeUpdate(query2);

        System.out.println((query!=null) ? "Sucessfully ✅" : "Failed ❌");

    }
}

