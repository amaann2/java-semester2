import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class p32 extends JFrame implements ActionListener {
    int x;
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JComboBox<String> c1;
    JButton b1, b2;

    p32() {
        l1 = new JLabel("Select Your Product :");
        l2 = new JLabel("Enter Quantity :");
        l3 = new JLabel("");
        l4 = new JLabel("");
        t1 = new JTextField(10);

        b1 = new JButton("Generate Bill");
        b2 = new JButton("Reset");
        b1.addActionListener(this);
        b2.addActionListener(this);

        c1 = new JComboBox<String>();
        c1.addItem("Pen");
        c1.addItem("Pencil");
        c1.addItem("Marker");

        add(l1);
        add(c1);
        add(l2);
        add(t1);
        add(b1);
        add(b2);
        add(l3);
        add(l4);

        setTitle("Bill");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            int qty=Integer.parseInt(t1.getText());

            if(c1.getSelectedItem().equals("Pen")){
                x=qty*10;
                l3.setText("You Bought "+qty);
                l4.setText("Grand Total is "+x);
            }
            else if(c1.getSelectedItem().equals("Pencil")){
                x=qty*8;
                l3.setText("You Bought "+qty);
                l4.setText("Grand Total is "+x);
            }
            else if(c1.getSelectedItem().equals("Marker")){
                x=qty*20;
                l3.setText("You Bought "+qty);
                l4.setText("Grand Total is "+x);
            }
        }
        else if(ae.getSource()==b2){
            t1.setText("");
            l3.setText("");
            l4.setText("");
        }
      
    }

    public static void main(String ar[]) {
        new p32();
    }

}
