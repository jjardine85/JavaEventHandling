import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI1B implements ActionListener {
    JButton button;

    public static void main (String [] args) {
        SimpleGUI1B gui = new SimpleGUI1B();
        gui.go();
    }

        public void go() {
            JFrame frame = new JFrame();
            button = new JButton("click me");
            button.addActionListener(this);

            frame.getContentPane().add(button);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setSize(500, 500);

            frame.setVisible(true);
        }

        public void actionPerformed(ActionEvent event) {
            button.setText("I've been clicked");
        }

//        JCheckBox box = new JCheckBox("test?");



//        frame.getContentPane().add(button);
//        frame.getContentPane().add(box);
//
//




}
