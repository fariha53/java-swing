package javaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
public static Container c;
    public static void main(String[] args) {
	// write your code here
        JFrame f = new JFrame("My frame");
        f.setSize(400,400);
        f.setVisible(true);
        c = f.getContentPane();

        JButton b = new JButton("RED");
        b.setBounds(20,100,100,30);
        JButton b1 = new JButton("YELLOW");
        b1.setBounds(150,100,100,30);
        JButton b2 = new JButton("GREEN");
        b2.setBounds(270,100,100,30);

        c.add(b);
        c.add(b1);
        c.add(b2);
        c.setLayout(null);
        b.addActionListener(new RedClass());
        b1.addActionListener(new YellowClass());
        b2.addActionListener(new GreenClass());

    }
}
class RedClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
           Main.c.setBackground(Color.RED);

    }}
    class YellowClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Main.c.setBackground(Color.YELLOW);

        }}
        class GreenClass implements ActionListener{
            public void actionPerformed(ActionEvent e){
                Main.c.setBackground(Color.GREEN);

            }
}