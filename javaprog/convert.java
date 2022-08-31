import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class convert extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1;
    JTextField t1;

    public convert() {
        l1 = new JLabel("Enter any number in meter into centimeter");
        l2 = new JLabel("");
        t1 = new JTextField(10);
        b1 = new JButton("convert into centimeter");
        add(l1);
        add(t1);
        add(b1);
        add(l2);
        b1.addActionListener(this);
        setSize(300, 300);
        setVisible(true);
        setTitle("conversion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int a = Integer.parseInt(t1.getText());
            l2.setText("" + a * 100);
        }
    }

    public static void main(String[] args) {
        new convert();
        System.out.println("hi");
    }


}
