import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class first  extends JFrame implements ActionListener
{
  JLabel l1,l2,l3,l4,l5;
  JComboBox cb1;
  JButton b1,b2;
  JTextField t1,t2;

  first ()
  {
    l1=new JLabel("Select Your Product");
    l2=new JLabel("Enter Required Quantity");
    l3=new JLabel("");
    cb1=new JComboBox();
    cb1.addItem("Pen");
    cb1.addItem("Pencil");
    cb1.addItem("Color Pencil");
    cb1.addItem("Eraser");
    b1=new JButton("Reset");
    b2=new JButton("Generate Bill");
    t1=new JTextField(30);

    add(l1);add(cb1);
    add(l2);add(t1);
    add(b2);add(b1);
    add(l3);
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(400,400);
    setTitle("Product");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    b1.addActionListener(this);
    b2.addActionListener(this);
   
  }
 
   public void actionPerformed(ActionEvent ae)
  {
    int a = Integer.parseInt(t1.getText());
       String s=(String)cb1.getSelectedItem();
        if (ae.getSource()==b2)
        {
            if (s.equals("Pen"))
            {
                l3.setText("YOU HAVE SELECTED"  + a +  "PENS. YOUR GRAND TOTAL=" + (a * 10.0));
            } else if (s.equals("Pencil")) {
                l3.setText("YOU HAVE SELECTED"  + a + "PENCILS. YOUR GRAND TOTAL=" + (a * 5.0));
            } else if (s.equals("Color Pencils")) {
                l3.setText("YOU HAVE SELECTED" + a +  "COLOR PENCILS. YOUR GRAND TOTAL=" + (a * 50.0));
            } else
            {
                l3.setText("YOU HAVE SELECTED"  + a +  "ERASER. YOUR GRAND TOTAL=" + (a * 5.0));
            }
        }
       if (ae.getSource()==b1)
    {
     t1.setText("");
     l3.setText("");
    }

  }

  public static void main(String[]args)
  {
    new first ();
  }
 
}