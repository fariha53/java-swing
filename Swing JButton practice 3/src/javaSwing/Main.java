package javaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    Container c ;
    JButton b1,b2,b3;
    MyFrame()
    {
        c = this.getContentPane();
        b1 = new JButton("YELLOW");
        b1.setBounds(20,100,100,30);
        b2 = new JButton("GREEN");
        b2.setBounds(150,100,100,30);
        b3 = new JButton("RED");
        b3.setBounds(270,100,100,30);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.setLayout(null);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
        {
            c.setBackground(Color.YELLOW);
        }else if(e.getSource()==b2)
        {
            c.setBackground(Color.GREEN);
        }else
        {
            c.setBackground(Color.RED);
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        MyFrame f = new MyFrame();
        f.setTitle("SWING!!");
        f.setSize(400,400);
        f.setVisible(true);
    }
}
