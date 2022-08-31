import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class one extends JFrame implements ActionListener {
    JLabel l1, l2;
    JButton b1;
    JTextField t1;

    one() {
        l1 = new JLabel("Enter any number in meter");
        l2 = new JLabel("");
        b1 = new JButton("convert");
        t1 = new JTextField(10);

        add(l1);
        add(t1);
        add(b1);
        add(l2);

        b1.addActionListener(this);
        
        setSize(300, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Conversion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == b1) {
          int n = Integer.parseInt(t1.getText());
          l2.setText(""+n*100);
        }
    }

    public static void main(String[] args) {
    new one();
    }
}