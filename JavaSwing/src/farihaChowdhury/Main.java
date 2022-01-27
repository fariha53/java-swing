package farihaChowdhury;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
       JFrame f = new JFrame("FIRST SWING PRATICE");
       JLabel l1 = new JLabel("First Label");
        l1.setBounds(50,50,100,30);
        JTextField t = new JTextField("Welcome ");
        t.setBounds(160,160,80,40);
        JCheckBox cb =new JCheckBox("C++");
        cb.setBounds(100,120, 50,50);


        JLabel l2 = new JLabel("2nd Label");
        l2.setBounds(50,100,100,30);

       JButton b =new JButton("CLICK");
       b.setBounds(160,80,80,40);
       f.add(b);
       f.add(cb);

       f.add(t);
       f.add(l1);
       f.add(l2);
       f.setSize(300,300);
       f.setLayout(null);
       f.setVisible(true);

    }
}
