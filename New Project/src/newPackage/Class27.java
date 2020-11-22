package newPackage;

import java.awt.*;

import javax.swing.*;

// frame
public class Class27 {
    public static void main(String[] args) {
        MyFrame2 a=new MyFrame2();
    }
}

class MyFrame1 extends JFrame {
    MyFrame1() {
        setTitle("Frame Title");
        setVisible(true);
        setSize(500,500);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        /*setLayout(new FlowLayout());
        setLayout(new GridLayout(3,3));*/

        JButton b=new JButton("Button");
        b.setSize(200,200);
        b.setLocation(30,30);
        
        add(b);
        
        JLabel c=new JLabel("Label");
        c.setSize(100,100);
        c.setLocation(300,50);
        
        add(c);
    }
}
