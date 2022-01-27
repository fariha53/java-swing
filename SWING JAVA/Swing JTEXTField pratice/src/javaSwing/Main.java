package javaSwing;
import  javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame f = new JFrame("MY FRAME");

        JTextField t = new JTextField("Welcome to Javatpoint.");
        t.setBounds(50,100, 200,30);

        JTextField t2 = new JTextField();
        t2.setBounds(50,150,200,30);

        JTextField t3 = new JTextField();
        t3.setBounds(50,200,200,30);

        t3.setText("JAVA SWING");

        Font font = new Font("Arial",Font.ITALIC,15);
        t3.setFont(font);

        t3.setForeground(Color.BLUE);
        t3.setBackground(Color.LIGHT_GRAY);

        t3.setEditable(false); //CANNOT EDIT ANYMORE t3


        f.add(t);
        f.add(t2);
        f.add(t3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
