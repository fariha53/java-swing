package FarihaChowdhury;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //JFrame = a GUI window to add a components to

        JFrame f = new JFrame(); //create a frame
        f.setTitle("JFrame title goes here"); //sets title of frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        f.setResizable(false);//prevent frame from being resized
        f.setSize(420,420);// sets the x-dimension, & y-dimension of frame
        f.setVisible(true);// make a frame visible

        ImageIcon image = new ImageIcon("unnamed.jpg"); //create an imageIcon
        f.setIconImage(image.getImage());
        f.getContentPane().setBackground(Color.LIGHT_GRAY);//change color of background

    }
}
