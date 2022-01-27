package javaSwing;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String f_name = JOptionPane.showInputDialog(null,"Enter your first name: ","This is a title",JOptionPane.QUESTION_MESSAGE);
                String l_name =JOptionPane.showInputDialog("Last name: ");
        String name = f_name+" "+l_name;
        JOptionPane.showMessageDialog(null,"Your full name :"+ name);

    }
}
