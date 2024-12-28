package Src;

import java.io.FileOutputStream;
import java.sql.*;

public class Fetch_Image {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seconddatabase","root","2002");
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM image");

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            Blob b = rs.getBlob(3);

            byte arr[] = b.getBytes(1,(int) b.length());

            FileOutputStream fos = new FileOutputStream("C:\\Users\\RAHUL THAKUR\\JDBC\\Image\\Dev.jpg");
            fos.write(arr);

            fos.close();
        }
        System.out.println("Ok");
        con.close();
    }
}
