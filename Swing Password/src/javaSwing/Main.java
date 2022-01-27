package javaSwing;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame f =new JFrame("MY FRAME");

        JLabel l1 = new JLabel("USERNAME: ");
        l1.setBounds(20,100,200,30);
        f.add(l1);
        JTextField t = new JTextField();
        t.setBounds(100,100,200,30);
        f.add(t);

        t.setEditable(true);

        JLabel l2 =new JLabel("PASSWORD: ");
        l2.setBounds(20,150,200,30);
        f.add(l2);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,150,200,30);

        pass.setEchoChar('*');
      //  pass.setEchoChar((char)0);

        f.add(pass);

        pass.setEditable(true);

        JLabel l3 =new JLabel("SHOW PASSWORD: ");
        l3.setBounds(20,230,200,30);
        f.add(l3);

        JPasswordField password = new JPasswordField();
        password.setBounds(150,230,200,30);

        password.setEchoChar((char) 0);
        f.add(password);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


    }
}
