import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import  java.awt.Component;



class bill extends JFrame implements ActionListener {
   int x;
   int qty;
   JLabel l1, l2, l3, l4;
   JTextField t1;
   JButton b1, b2;
   JComboBox<String> c1;
   JFrame f = new JFrame();

   public bill() {
      l1 = new JLabel("Select your product: ");
      l2 = new JLabel("Enter Quantity");
      l3 = new JLabel("");
      l4 = new JLabel("");

      t1 = new JTextField(20);

      b1 = new JButton("Generate");
      b2 = new JButton("Reset");

      b1.addActionListener(this);
      b2.addActionListener(this);

      c1 = new JComboBox<String>();
      c1.addItem("Pen");
      c1.addItem("Pencil");
      c1.addItem("marker");

      add(l1);
      add(c1);
      add(l2);
      add(t1);
      add(b1);
      add(b2);
      add(l3);
   add(l4);

      setSize(500, 500);
      setVisible(true);
      setLayout(new FlowLayout());
      setTitle("Product Bill");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   @override
   public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == b1) {
         qty = Integer.parseInt(t1.getText());

         if (c1.getSelectedItem().equals("Pen")) {
            x = qty * 10;
            l3.setText("You brought " + qty);
            l4.setText("Grand total is " + x);
         } else if (c1.getSelectedItem().equals("Pencil")) {
            x = qty * 8;
            l3.setText("You brought " + qty);
            l4.setText("Grand total is " + x);
         } else if (c1.getSelectedItem().equals("marker")) {
            x = qty * 20;
            l3.setText("You brought " + qty);
            l4.setText("Grand total is " + x);
         }
      } else if (ae.getSource() == b2) {
            t1.setText("");
            l3.setText("");
            l4.setText("");
      }
   }



   public static void main(String[] args) {
     new bill();
   }
}