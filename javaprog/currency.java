import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class currency extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JButton b1, b2;
    JComboBox<String> c1, c2;
    JTextField t1, t2;

    public currency() {
        l1 = new JLabel("From");
        l2 = new JLabel("To");
        l3 = new JLabel("Enter Amount to convert");
        l4 = new JLabel("Total amount converted");


        c1 = new JComboBox<String>();
        c1.addItem("Indian");
        c1.addItem("US Dolor");
        c1.addItem("Japan Yen");
        c1.addItem("Taiwan Dollar");
        c1.addItem("Philliphine peso");

        c2 = new JComboBox<String>();
        c2.addItem("Indian");
        c2.addItem("US Dolor");
        c2.addItem("Japan Yen");
        c2.addItem("Taiwan Dollar");
        c2.addItem("Philliphine peso");

        t1 = new JTextField(10);
        t2 = new JTextField(10);

        b1 = new JButton("Compute");
        b2 = new JButton("Reset");

        add(l1);
        add(c1);
        add(l2);
        add(c2);
        add(l3);
        add(t1);
        add(l4);
        add(t2);
        add(b1);
        add(b2);

        t1.addActionListener(this);
        t2.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);

        setTitle("Money Currency Converter");
        setLayout(new FlowLayout());
        setSize(300, 280);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        double a, c = 0;
        a = Double.valueOf(t1.getText());
        if (ae.getSource() == b1) {
            {
                if (c1.getSelectedItem().equals("Indian") & c2.getSelectedItem().equals("US Dolor")) {
                    c = a / 76.28;
                }
                if (c1.getSelectedItem().equals("Indian") & c2.getSelectedItem().equals("Japan Yen")) {
                    c = a / 0.63;
                }
                if (c1.getSelectedItem().equals("Indian") & c2.getSelectedItem().equals("Taiwan Dollar")) {
                    c = a * 0.38 ;
                }
                if (c1.getSelectedItem().equals("Indian") & c2.getSelectedItem().equals("Philliphine peso")) {
                    c = a * 0.69;
                }

                if (c1.getSelectedItem().equals("US Dolor") & c2.getSelectedItem().equals("Indian")) {
                    c = a * 76.28;
                }
                if (c1.getSelectedItem().equals("US Dolor") & c2.getSelectedItem().equals("Japan Yen")) {
                    c = a * 122.09;
                }
                if (c1.getSelectedItem().equals("US Dolor") & c2.getSelectedItem().equals("Taiwan Dollar")) {
                    c = a * 26.68;
                }
                if (c1.getSelectedItem().equals("US Dolor") & c2.getSelectedItem().equals("Philliphine peso")) {
                    c = a * 52.28;
                }

                if (c1.getSelectedItem().equals("Japan Yen") & c2.getSelectedItem().equals("Indian")) {
                    c = a * 60.335456;
                }
                if (c1.getSelectedItem().equals("Japan Yen") & c2.getSelectedItem().equals("US Dolor")) {
                    c = a * 60.335456;
                }
                if (c1.getSelectedItem().equals("Japan Yen") & c2.getSelectedItem().equals("Taiwan Dollar")) {
                    c = a * 60.335456;
                }
                if (c1.getSelectedItem().equals("Japan Yen") & c2.getSelectedItem().equals("Philliphine peso")) {
                    c = a * 60.335456;
                }

                if (c1.getSelectedItem().equals("Taiwan Dollar") & c2.getSelectedItem().equals("Indian")) {
                    c = a * 60.335456;
                }
                if (c1.getSelectedItem().equals("Taiwan Dollar") & c2.getSelectedItem().equals("US Dolor")) {
                    c = a * 60.335456;
                }
                if (c1.getSelectedItem().equals("Taiwan Dollar") & c2.getSelectedItem().equals("Japan Yen")) {
                    c = a * 60.335456;
                }
                if (c1.getSelectedItem().equals("Taiwan Dollar") & c2.getSelectedItem().equals("Philliphine peso")) {
                    c = a * 60.335456;
                }


                if (c1.getSelectedItem().equals("Philliphine peso") & c2.getSelectedItem().equals("Indian")) {
                    c = a * 60.335456;
                }
                if (c1.getSelectedItem().equals("Philliphine peso") & c2.getSelectedItem().equals("US Dolor")) {
                    c = a * 60.335456;
                }
                if (c1.getSelectedItem().equals("Philliphine peso") & c2.getSelectedItem().equals("Japan Yen")) {
                    c = a * 60.335456;
                }
                if (c1.getSelectedItem().equals("Philliphine peso") & c2.getSelectedItem().equals("Taiwan Dollar")) {
                    c = a * 60.335456;
                }
     
                t2.setText(String.valueOf(c));
            }
            if (ae.getSource() == b2) {
                t1.setText("");
                t2.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new currency();
    }

}
