import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class prac4 extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenuItem file;
    JMenu open, color;

    prac4(){
    open = new JMenu("open file");
    color = new JMenu("Select Colour");

    file = new JMenuItem("file");
    file.add(open);
    file.add(color);

    
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

        }
    }

    public static void main(String[] args) {

    }
}
