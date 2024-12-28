package Src;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_Image {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seconddatabase","root","2002");
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO image (id,Name,Photo)values(?,?,?)");
        pstmt.setString(1,"101");
        pstmt.setString(2,"Mahadev Image");

        FileInputStream fs = new FileInputStream("C:\\Users\\RAHUL THAKUR\\OneDrive\\Pictures\\Saved Pictures\\MahadevWallper.jpg");
        pstmt.setBinaryStream(3,fs,fs.available());

        int i = pstmt.executeUpdate();

        System.out.println((i>0) ? "Record Insert Successfully" : "Record Insert Failure");

    }
}
