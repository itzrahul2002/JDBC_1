package Src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Prepare_Statement {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seconddatabase","root","2002");

        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Number you want to Insert : ");
        n=sc.nextInt();

        PreparedStatement pstmt = con.prepareStatement("insert into student(Id,Name,Course,Address)values(?,?,?,?)");

        if(pstmt!=null){
            for(int i=0; i<n; i++){
                System.out.println("Enter Student ID: " );
                int id = sc.nextInt();
                System.out.println("Enter Student Name: " );
                String name = sc.next();
                System.out.println("Enter Student Course :");
                String coruse = sc.next();
                System.out.println("Enter Student Address");
                String address = sc.next();

                pstmt.setInt(1,id);
                pstmt.setString(2,name);
                pstmt.setString(3,coruse);
                pstmt.setString(4,address);

                int result=pstmt.executeUpdate();

                System.out.println((result==0) ? "Student Data Insert Failed" : "Student Data Inserted Successfully");
            }
        }
        ResultSet rs = pstmt.executeQuery("SELECT * FROM student");

        while (rs.next()){
            System.out.println("---------------------------------------------");
            System.out.println("Student Id : " + rs.getInt(1));
            System.out.println("Student Name : " + rs.getString(2));
            System.out.println("Student Course : " + rs.getString(3));
            System.out.println("Student Address : " + rs.getString(4));
            System.out.println("----------------------------------------------");
        }
    }
}
