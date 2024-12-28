package Src;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Swing_2 extends JFrame implements ActionListener {
    JPasswordField tflpass;
    JDateChooser dob;
    JTextField tfname,tflname;
    JTextArea jtextarea;
    JButton submit;
    Swing_2(){
        JLabel heading = new JLabel("Registration Form");
        heading.setBounds(160,30,300,35);
        heading.setForeground(Color.red);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);

        JLabel lblname = new JLabel("FirstName :");
        lblname.setBounds(60,120,100,20);
        lblname.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(190,115,200,30);
        add(tfname);

        JLabel lbllnama = new JLabel("Last Name :");
        lbllnama.setBounds(60,180,100,20);
        lbllnama.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbllnama);

        tflname = new JTextField();
        tflname.setBounds(190,180,200,30);
        add(tflname);

        JLabel lbllpass = new JLabel("Password  :");
        lbllpass.setBounds(60,240,100,20);
        lbllpass.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbllpass);

        tflpass = new JPasswordField();
        tflpass.setBounds(190,240,200,30);
        add(tflpass);

        JLabel lbldob = new JLabel("Date of Birth :");
        lbldob.setBounds(60,300,150,20);
        lbldob.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbldob);

        dob = new JDateChooser();
        dob.setBounds(190,300,200,30);
        add(dob);

        JLabel lbltext = new JLabel("Subject :");
        lbltext.setBounds(60,360,150,20);
        lbltext.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbltext);

        jtextarea = new JTextArea();
        jtextarea.setBounds(190,360,200,100);
        add(jtextarea);



        submit = new JButton("Submit");
        submit.setBounds(130,510,200,40);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,15));
        add(submit);




        setBounds(350,15,600,650);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            String fname =tfname.getText();
            String lname =tflname.getText();
            String password = tflpass.getText();
            String dcob =((JTextField)dob.getDateEditor().getUiComponent()).getText();
            String area = jtextarea.getText();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/seconddatabase","root","2002");
                Statement stmt = c.createStatement();

                String query = "insert into Registration_Form values('"+fname+"','"+lname+"','"+password+"','"+dcob+"','"+area+"')";

                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Data Inserted Successfully 🙏");
                setVisible(false);

            }catch (Exception ee){
                ee.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Swing_2();
    }

}
