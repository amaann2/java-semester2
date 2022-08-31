import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;

public class practtwo extends JFrame implements ActionListener{
    JTextField t1, t2, t3;
    JButton b1, b2, b3;
    JRadioButton r1, r2;
    JComboBox cb1;
    JPanel p1,p2,p3;

    practtwo() {
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        b1 = new JButton("Enable");
        b2 = new JButton("Disable");
        b3 = new JButton("add");

        r1 = new JRadioButton("First");
        r2 = new JRadioButton("Second");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        cb1 = new JComboBox();
        cb1.addItem("test");

        p1=new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        p1.add(t1);
        p1.add(b1);
        p1.add(b2);

        p2.add(t2);
        p2.add(r1);
        p2.add(r2);

        p3.add(t3);
        p3.add(b3);
        p3.add(cb1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
        b3.addActionListener(this);

        JTabbedPane jp = new JTabbedPane();

        jp.add(p1);
        jp.add(p2);
        jp.add(p3);

        add(jp);
        setTitle("JPAnned");
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource()==r1) {
        t2.setText("one");
    }
    else if (ae.getSource()==r2) {
        t2.setText("two");
    }
    }

    public static void main(String[] args) {
new practtwo();
    }
}
