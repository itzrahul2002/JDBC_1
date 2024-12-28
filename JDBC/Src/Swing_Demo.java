package Src;

import javax.swing.*;

public class Swing_Demo {
    public static void main(String[] args){
        JFrame jf = new JFrame("Swing Demo");
        jf.setBounds(300,160,600,400);
        jf.setLayout(null);
        jf.setVisible(true);

        JLabel label = new JLabel("Enter Your Name : ");
        label.setBounds(50,50,150,40);
        jf.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(180,53,150,30);
        jf.add(textField);

        JLabel lblpass = new JLabel("Enter Your Password : ");
        lblpass.setBounds(50,80,180,40);
        jf.add(lblpass);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(180,130,150,30);
        jf.add(pass);

        JButton button = new JButton("Submit");
        button.setBounds(180,130,150,30);
        jf.add(button);
    }
}
