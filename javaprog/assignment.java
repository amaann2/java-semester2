import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class assignment extends JFrame implements ActionListener, ListSelectionListener {

    JLabel l1, l2, l3, l4;
    JButton b1;
    JComboBox<String> cb1;
    JTextField t1;
    JList<String> li;
    String str[] = { "Notepad", "Folder", "Pen" };
    JRadioButton r1, r2;
    JCheckBox c1, c2;
    int a=0, b, c, d, amt, e;

    public assignment() {

        l1 = new JLabel("Choose Product");
        l2 = new JLabel("Choose Storage type");
        l3 = new JLabel("Choose Tools");
        l4 = new JLabel("");

        li = new JList<String>(str);

        c1 = new JCheckBox("Lan Cable");
        c2 = new JCheckBox("RJ45 Connectors");

        r1 = new JRadioButton("Traditional Mouse");
        r2 = new JRadioButton("Wireless Mouse");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        b1 = new JButton("Generate bill");

        cb1 = new JComboBox<String>();
        cb1.addItem("Pen-Drive");
        cb1.addItem("Hdd");
        cb1.addItem("ssd");

        add(l1);
        add(new JScrollPane(li));
        add(l2);
        add(c1);
        add(cb1);
        add(l3);
        add(c1);
        add(c2);
        add(r1);
        add(r2);
        add(b1);
        add(l4);

        cb1.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
        li.addListSelectionListener(this);
        li.setVisibleRowCount(3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        b1.addActionListener(this);

        setTitle("Billing Application");
        setLayout(new FlowLayout());
        setSize(450, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void valueChanged(ListSelectionEvent le) {
       
        if (li.getSelectedValue().equals("Notepad")) {
            a = 10;
        }
        if (li.getSelectedValue().equals("Folder")) {
            a = 15;

        }
        if (li.getSelectedValue().equals("Pen")) {
            a = 8;

        }
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            if (cb1.getSelectedItem().equals("Pen-Drive")) {
                b = 100;

            }
            if (cb1.getSelectedItem().equals("Hdd")) {
                b = 150;

            }
            if (cb1.getSelectedItem().equals("ssd")) {
                b = 200;

            }
            if (c1.isSelected()) {
                c = 250;

            }
            if (c2.isSelected()) {
                d = 280;

            }
            if (r1.isSelected()) {
                e = 150;

            }
            if (r2.isSelected()) {
                e = 170;

            }
            amt = a + b + c + d + e;
            l4.setText("bill is Rupees " + amt + " only");
        }
    }

    public static void main(String[] args) {
        new assignment();
    }
}