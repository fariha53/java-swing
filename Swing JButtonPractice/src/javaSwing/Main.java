package javaSwing;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        JFrame f = new JFrame();

        JLabel l1 = new JLabel("Username: ");
        l1.setBounds(20,100,200,30);
        f.add(l1);
        JTextField t = new JTextField();
        t.setBounds(100,100,200,30);
        f.add(t);

        JLabel l2 = new JLabel("Password: ");
        l2.setBounds(20,150,200,30);
        f.add(l2);
        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,150,200,30);
        f.add(pass);
        JButton b = new JButton("Login");
        b.setBounds(50,300,100,30);

        Font font = new Font("Arial",Font.BOLD,20);
        b.setFont(font);

      //  b.setText("Click");
        b.setForeground(Color.BLUE);
        b.setBackground(Color.LIGHT_GRAY);

        b.setEnabled(true);


Cursor cur = new Cursor(Cursor.HAND_CURSOR);
b.setCursor(cur);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
