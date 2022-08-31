import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;

public class bill extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JButton b1, b2;
    JTextField t1;
    JComboBox c1;

    bill() {
        l1 = new JLabel("Select your product");
        l2 = new JLabel("Enter Required Amount");
        l3 = new JLabel("");

        b1 = new JButton("Generate Bill");
        b2 = new JButton("Reset");

        t1 = new JTextField(30);

        c1 = new JComboBox();
        c1.addItem("Pen");
        c1.addItem("pencil");
        c1.addItem("Sharpner");
        c1.addItem("Eraser");

        add(l1);
        add(c1);
        add(l2);
        add(t1);
        add(b1);
        add(b2);
        add(l3);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setTitle("bill");
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(t1.getText());
        String s = (String) c1.getSelectedItem();

        if (ae.getSource() == b1) {
            if (s.equals("Pen")) {
                l3.setText("You have selected " + a + " pens. your grand total is " + (a * 10));
            } else if (s.equals("pencil")) {
                l3.setText("you have selected" + a + "pencil . your grand total is" + (a * 5));
            } else if (s.equals("Sharpner")) {
                l3.setText("You Have selected " + a + " sharpner. your grand total is" + (a * 12));
            } else if (s.equals("Eraser")) {
                l3.setText("You have selected" + a + "Eraser. you grand total is" + (a * 4));
            }
        } else if (ae.getSource() == b2) {
            t1.setText("");
            l3.setText("");
        }
    }

    public static void main(String[] args) {
        new bill();
    }
}
