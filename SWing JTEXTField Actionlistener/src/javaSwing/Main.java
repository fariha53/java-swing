package javaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	// write your code here

        JFrame f = new JFrame("MY FRAME");

        Container c = f.getContentPane();
        c.setBackground(Color.ORANGE);
        JTextField t1 =new JTextField();
        t1.setBounds(50,100,200,30);


        JTextField t2 =new JTextField();
        t2.setBounds(50,150,200,30);

        t1.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
    String s= t1.getText();
    if(s.isEmpty())
    {
        JOptionPane.showMessageDialog(null,"You did not enter anything");
    }
    else
    {
        JOptionPane.showMessageDialog(null,"t1 ="+s);
    }

}


        });

        t2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {
             String s1 = t2.getText();

             if(s1.isEmpty())
             {
                 JOptionPane.showMessageDialog(null,"You did not enter anything");
             }
             else{
                 JOptionPane.showMessageDialog(null,"T2 ="+s1);
             }
            }

        });

        f.add(t1);
        f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
