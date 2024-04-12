package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        setLayout(null);
        add(label);
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        JTextField cardTextfield= new JTextField();
        cardTextfield.setBounds(300,150,230,30);
        add(cardTextfield);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
        JTextField pinTextfield= new JTextField();
        pinTextfield.setBounds(300,220,230,30);
        add(pinTextfield);

        JButton login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        add(login);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);

        JButton clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        add(clear);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);

        JButton signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        add(signup);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);

        getContentPane().setBackground(Color.white);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    public static void main(String args[]){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
