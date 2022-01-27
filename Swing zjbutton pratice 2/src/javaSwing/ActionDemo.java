package javaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    Container c;
    JButton b;
     MyFrame() //Constructor
     {
         c = this.getContentPane();
         c.setLayout(null);

         b = new JButton("Click me");
         b.setBounds(50,100,100,30);
         c.add(b);
         b.addActionListener(this);
     }

     public void actionPerformed(ActionEvent e){
         c.setBackground(Color.BLUE);

     }
}
public class ActionDemo {

    public static void main(String[] args) {
	
        MyFrame f=new MyFrame();//Object
        f.setTitle("Action Demo");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
