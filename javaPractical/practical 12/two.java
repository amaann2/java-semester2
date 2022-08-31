import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class two implements ActionListener
{
    JFrame f;
    JTextField t1,t2,t3;
    JRadioButton rb1,rb2;
    JButton disable,enable,add;
    JComboBox cb1;
    JPanel p1,p2,p3;

    two()
    {
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        ButtonGroup bg = new ButtonGroup();
        rb1 = new JRadioButton("first");
        rb2 = new JRadioButton("second");
        bg.add(rb1);
        bg.add(rb2);

        cb1 = new JComboBox();
        cb1.addItem("TEST");

        add = new JButton("ADD");
        disable = new JButton("DISABLE");
        enable = new JButton("ENABLE");

        f = new JFrame();
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        add.addActionListener(this);
        enable.addActionListener(this);
        disable.addActionListener(this);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
    

        p1.add(t1);
        p1.add(enable);
        p1.add(disable);

        p2.add(t2);
        p2.add(rb1);
        p2.add(rb2);

        p3.add(t3);
        p3.add(add);
        p3.add(cb1);

        JTabbedPane tp = new JTabbedPane();

        tp.add(p1);
        tp.add(p2);
        tp.add(p3);
 
        f.add(tp);

        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==rb1)
        {
            t2.setText("YOU HAVE SELECTED ONE");
        }
         else if(ae.getSource()==rb2)
         {
             t2.setText("YOU HAVE SELECTED TWO");
         }
         if (ae.getSource()==add)
         {
             String text=t3.getText();
             cb1.addItem("text");
         }  
         if (ae.getSource()==enable)
         {
             t1.setEnabled(true);
         }
         else if (ae.getSource()==disable)
         {
             t1.setEnabled(false);
         }
    }
    public static void main(String args[])
    {
        new two();
    }
}
