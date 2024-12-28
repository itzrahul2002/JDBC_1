package Src;

import javax.swing.*;

public class Swing_1 {
    public static void main(String[] args)
    {

        JLabel l3 = new JLabel();
        l3.setText("Registration Form");
        JFrame jf1 = new JFrame("First Swing Programme");
        JButton jb = new JButton("Login");
        JTextField jt = new JTextField();
        JLabel l1 = new JLabel("User Name : ");
        JPasswordField jp = new JPasswordField();
        JLabel l2 = new JLabel("Password  : ");

        l3.setBounds(150, 40, 110, 40);
        l1.setBounds(50, 150, 80, 30);
        jt.setBounds(150, 150, 150, 30);
        jp.setBounds(150, 200, 150, 30);
        jb.setBounds(100, 250, 110, 30);
        l2.setBounds(50, 200, 80, 30);

        jf1.add(jb);jf1.add(jt);jf1.add(l1);jf1.add(jp);jf1.add(l2);
        jf1.add(l3);
        jf1.setSize(400,500);
        jf1.setLayout(null);
        jf1.setVisible(true);


    }
}
