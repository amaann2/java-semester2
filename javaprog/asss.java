import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.FlowLayout;

import java.awt.*;
import java.awt.event.*;

class assignment extends JFrame implements ActionListener, ListSelectionListener {
    int x, y, z, w, k, total;
    JLabel lb1, lb2, lb3, lb4;
    JList<String> li1;
    String str[] = { "Notepad", "Folder", "Pen" };
    JComboBox<String> cb1;
    JCheckBox c1, c2;
    JRadioButton rb1, rb2;
    JButton jb1;

    assignment() {
        lb1 = new JLabel("Choose Products");
        lb2 = new JLabel("Choose Storage Type");
        lb3 = new JLabel("Choose Tools");
        lb4 = new JLabel(" ");

        // DefaultListModel<String> li1=new DefaultListModel<String>();
        // li1.addElement("Notepad");
        // li1.addElement("Folder");
        // li1.addElement("Pen");
        li1 = new JList<String>(str);

        cb1 = new JComboBox<String>();
        cb1.addItem("Pen-Drive");
        cb1.addItem("HDD");
        cb1.addItem("SSD");

        c1 = new JCheckBox("Lan Cable");
        c2 = new JCheckBox("RJ45 Connectors");

        rb1 = new JRadioButton("Traditional Mouse");
        rb2 = new JRadioButton("Wireless Mouse");

        jb1 = new JButton("Generate Bill");

        ButtonGroup rb = new ButtonGroup();
        rb.add(rb1);
        rb.add(rb2);

        add(lb1);
        add(new JScrollPane(li1));
        add(lb2);
        add(cb1);
        add(lb3);
        add(c1);
        add(c2);
        add(rb1);
        add(rb2);
        add(jb1);
        add(lb4);

        cb1.addActionListener(this);
        li1.addListSelectionListener(this);
        li1.setVisibleRowCount(3);
        c1.addActionListener(this);
        c2.addActionListener(this);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        jb1.addActionListener(this);

        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Billing Application");
        setLayout(new FlowLayout());
        setVisible(true);

    }

    public void valueChanged(ListSelectionEvent le) {
        if (li1.getSelectedValue().equals("Notepad")) {
            x = 10;
        }
        if (li1.getSelectedValue().equals("Folder")) {
            x = 15;
        }
        if (li1.getSelectedValue().equals("Pen")) {
            x = 8;
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jb1) {

            if (cb1.getSelectedItem().equals("Pen-Drive")) {
                y = 100;
            }
            if (cb1.getSelectedItem().equals("HDD")) {
                y = 150;
            }

            if (cb1.getSelectedItem().equals("SSD")) {
                y = 200;
            }

            if (c1.isSelected()) {
                z = 250;
            }

            if (c2.isSelected()) {
                k = 280;
            }

            if (rb1.isSelected()) {
                w = 150;
            }

            if (rb2.isSelected()) {
                w = 170;
            }
            total = x + y + z + w + k;
            lb4.setText("Bill is Rs." + total + " only");

        }
    }

    public static void main(String[] args) {
        new assignment();
    }
}