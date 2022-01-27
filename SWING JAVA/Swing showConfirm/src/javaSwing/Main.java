package javaSwing;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
     int choice =   JOptionPane.showConfirmDialog(null,"Do you want to quit or not?","QUIT",JOptionPane.YES_NO_CANCEL_OPTION);
     if(choice==JOptionPane.YES_OPTION)
     {
System.exit(0);
     }
     else
     {
         System.out.println("You have checked no option");
     }
    }
}
