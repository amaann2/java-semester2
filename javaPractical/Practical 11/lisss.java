import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lisss extends JFrame implements ActionListener {
    JList l1, l2;
    JTextField t1;
    JButton b1;
    String[] list = { "roit", "wild", "cat", "rakesh bhai", "mukesh bhai", "suresh bhai", "rajesh bhai" };

    lisss() {
        l1 = new JList(list);
        l2 = new JList();
        l1.setVisibleRowCount(4);
        l2.setVisibleRowCount(4);
        l1.setBounds(300, 300, 100, 100);
        b1 = new JButton("copy");
        add(new JScrollPane(l1));
        add(new JScrollPane(l2));
        add(b1);
        b1.addActionListener(this);
        setSize(300, 300);
        setTitle("copy");
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            l2.setListData(l1.getSelectedValues());
        }
    }

    public static void main(String[] args) {
        new lisss();
    }
}
