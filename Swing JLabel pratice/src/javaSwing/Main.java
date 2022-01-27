package javaSwing;

import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
     JFrame f =new JFrame("MY FRAME");
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     Container c = f.getContentPane();
     c.setBackground(Color.PINK);

  JLabel l1 =new JLabel("ENTER USERNAME: ");
  l1.setBounds(50,50, 100,30);

        Font font= new Font("Arial",Font.ITALIC,12);
        l1.setFont(font);

        l1.setForeground(Color.RED);
        l1.setOpaque(true);
        l1.setBackground(Color.WHITE);


  JLabel l2 =new JLabel("PASSWORD: ");
  l2.setBounds(50,100, 100,30);

  l1.setText("USERNAME : ");

f.add(l1);
f.add(l2);

System.out.println("\n "+l2.getText());



     f.setLayout(null);
     f.setSize(300,300);


    }
}
