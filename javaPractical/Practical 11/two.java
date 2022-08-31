import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class two extends JFrame implements ActionListener{
    JList l1,l2;
    JButton b1;
    String bias[]={ "roit","wild","cat","rakesh bhai","mukesh bhai","suresh bhai","rajesh bhai"};

    two()
    {
        l1=new JList(bias);
        l2=new JList();
        l1.setVisibleRowCount(4);
        l2.setVisibleRowCount(4);
        b1=new JButton("copy");
        l1.setBounds(300,300,100,100);
        
        add(new JScrollPane(l1));
        add(new JScrollPane(l2));
        add(b1);

        b1.addActionListener(this);


        setSize(1000,1000);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("BIAS");

    }
    public void actionPerformed(ActionEvent ae)
    { 
         if(ae.getSource()==b1){
        l2.setListData(l1.getSelectedValues());
    }
}
    public static void main(String[] args){

        new two();
    }
}