package farihaChowdhury;
import java.awt.*;
import javax.swing.*;
public class RadioButtonExample {

    RadioButtonExample()
    {
        JFrame f = new JFrame("2nd Swing");
        JButton b = new JButton("CLICK");
        b.setBounds(160,100,80,50);

        JPanel panel=new JPanel();
        panel.setBounds(40,90,30,20);
        panel.setBackground(Color.green);
        f.add(panel);

        String country[]={"India","Aus","U.S.A","England","Newzealand"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(75, 180,90,20);
        f.add(cb);

        JRadioButton r1=new JRadioButton("A) Male");
        r1.setBounds(75,50,100,30);
        JRadioButton r2=new JRadioButton("B) Female");
        r2.setBounds(75,100,100,30);
        f.add(b);
        f.add(r1);
        f.add(r2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
	// write your code here
new RadioButtonExample();

    }
}
