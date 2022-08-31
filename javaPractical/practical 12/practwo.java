import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;

public class practwo implements ActionListener {
    JFrame f1;
    JTextField t1, t2, t3;
    JButton b1, b2, b3;
    JRadioButton r1, r2;
    JComboBox cb1;
    JPanel p1, p2, p3;

    practwo() {
        f1 = new JFrame();
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        r1 = new JRadioButton("First");
        r2 = new JRadioButton("second");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        b1 = new JButton("Add");
        b2 = new JButton("Enable");
        b3 = new JButton("Disable");

        cb1 = new JComboBox();
        cb1.addItem("item");
        cb1.addItem("item");
        cb1.addItem("item");

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        p1.add(t1);
        p1.add(r1);
        p1.add(r2);

        p2.add(t2);
        p2.add(b2);
        p2.add(b3);

        p3.add(t3);
        p3.add(b1);
        p3.add(cb1);

        JTabbedPane p = new JTabbedPane();
        p.add(p1);
        p.add(p2);
        p.add(p3);

        f1.add(p);
        f1.setVisible(true);
        f1.setSize(500, 500);
        f1.setLayout(new FlowLayout());
    }

    public void actionPerformed(ActionEvent ae) {
        {
            if (ae.getSource() == r1) {
                t2.setText("YOU HAVE SELECTED ONE");
            } else if (ae.getSource() == r2) {
                t2.setText("YOU HAVE SELECTED TWO");
            }
            if (ae.getSource() == b1) {
                String text = t3.getText();
                cb1.addItem("text");
            }
            if (ae.getSource() == b2) {
                t1.setEnabled(true);
            } else if (ae.getSource() == b3) {
                t1.setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        new practwo();
    }
}
