package javaSwing;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame f =new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,300);
       // f.setLocationRelativeTo(null);
        //f.setLocation(200,50);
        f.setBounds(200,50,400,300);
        f.setTitle("MY FRAME");


       ImageIcon img = new ImageIcon("download.png");
        f.setIconImage(img.getImage());

       Container c = f.getContentPane();
       c.setBackground(Color.RED);
        f.setResizable(false);
    }
}
