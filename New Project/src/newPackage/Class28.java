package newPackage;

import java.awt.*;

import javax.swing.*;

// login window
public class Class28 {
    public static void main(String[] args) {
        new MyFrame1();
    }
}

class MyFrame2 extends JFrame {
    JPanel panel=new JPanel();
    JTextField username=new JTextField();
    JTextField password=new JPasswordField();
    JButton login=new JButton("Login");
    
    MyFrame2() {
        setTitle("Login Window");
        setVisible(true);
        setLocation(800,450);
        setSize(337,191);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel.setLayout(null);
        add(panel);
        
        username.setLocation(15,15);
        username.setSize(165,45);
        panel.add(username);
        
        password.setLocation(15,75);
        password.setSize(165,45);
        panel.add(password);
        
        login.setLocation(195,15);
        login.setSize(105,105);
        panel.add(login);
    }
}
