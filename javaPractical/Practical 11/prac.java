import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class prac extends JFrame implements ActionListener {
    JList l1, l2;
    JButton b1;
    String[] s = { "rohit", "suresh", "rajesh", "mukesh" };

    prac() {
        l1 = new JList(s);
        l2 = new JList();
        b1 = new JButton("copy");

        add(new JScrollPane(l1));
        add(new JScrollPane(l2));
        add(b1);
        b1.addActionListener(this);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setTitle("copy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==b1){

        l2.setListData(l1.getSelectedValues());
       }
    }

    public static void main(String[] args) {
        new prac();
    }
}
