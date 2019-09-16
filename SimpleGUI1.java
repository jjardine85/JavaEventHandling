import javax.swing.*;
import java.awt.*;

public class SimpleGUI1 {
    public static void main (String [] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        JCheckBox box = new JCheckBox("test?");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.getContentPane().add(BorderLayout.PAGE_START, box);

        frame.setSize(500, 500);

        frame.setVisible(true);
    }

}
